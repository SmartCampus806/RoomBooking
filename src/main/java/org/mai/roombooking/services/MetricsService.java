package org.mai.roombooking.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.mai.roombooking.entities.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class MetricsService {
    @Autowired
    private BookingService bookingService;
    @Autowired
    private RoomService roomService;

    public Double averageBookingDuration() {
        return bookingService.getAll().stream()
                .map(x -> Duration.between(x.getStartTime(), x.getEndTime()))
                .mapToLong(Duration::toMinutes)
                .average()
                .orElse(0.0);
    }

    public Utilization roomUtilizationFrequency(LocalDateTime start, LocalDateTime end) {
        List<Room> rooms = roomService.getAllRooms();
        List<Double> data = new ArrayList<>();
        for (var room : rooms) {
            data.add((double) bookingService.getBookingsByRoomInTimeRange(room.getRoomId(), start, end).size());
        }
        return new Utilization(rooms.stream().map(Room::getRoomName).toList(), data);
    }

    @AllArgsConstructor
    @Data
    public static class Utilization {
        List<String> labels;
        List<Double> data;
    }

    public Utilization averageBookingDurationByRoom(LocalDateTime start, LocalDateTime end) {
        List<Room> rooms = roomService.getAllRooms();
        List<Double> data = new ArrayList<>();
        for (var room : rooms) {
            data.add(bookingService.getBookingsByRoomInTimeRange(room.getRoomId(), start, end).stream()
                    .map(x -> Duration.between(x.getStartTime(), x.getEndTime()))
                    .mapToLong(Duration::toMinutes)
                    .average()
                    .orElse(0.0));
        }
        return new Utilization(rooms.stream().map(Room::getRoomName).toList(), data);
    }

    public Utilization averageBookingZapolnennost(LocalDateTime start, LocalDateTime end) {
        List<Room> rooms = roomService.getAllRooms();
        List<Double> data = new ArrayList<>();
        for (var room : rooms) {
            var peepleCount = bookingService.getBookingsByRoomInTimeRange(room.getRoomId(), start, end).stream()
                    .map(x -> x.getGroups().size() * 25.0 + x.getStaff().size())
                    .mapToDouble(x -> x/room.getCapacity()).average()
                    .orElse(0.0);
            data.add(peepleCount);
        }
        return new Utilization(rooms.stream().map(Room::getRoomName).toList(), data);
    }

    public Utilization roomPopularityIndex(LocalDateTime start, LocalDateTime end) {
        List<Room> rooms = roomService.getAllRooms();
        List<Double> data = new ArrayList<>();
        for (var room : rooms) {
            var average = bookingService.getBookingsByRoomInTimeRange(room.getRoomId(), start, end).stream()
                    .map(x -> Duration.between(x.getStartTime(), x.getEndTime()))
                    .mapToLong(Duration::toMinutes)
                    .average()
                    .orElse(0.0);
            var count = bookingService.getBookingsByRoomInTimeRange(room.getRoomId(), start, end).size();
            data.add(average * count / 840 * 100 );
        }
        return new Utilization(rooms.stream().map(Room::getRoomName).toList(), data);
    }

}
