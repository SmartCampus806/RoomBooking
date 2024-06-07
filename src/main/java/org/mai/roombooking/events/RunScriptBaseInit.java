package org.mai.roombooking.events;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mai.roombooking.dtos.RoomDTO;
import org.mai.roombooking.entities.Group;
import org.mai.roombooking.entities.Room;
import org.mai.roombooking.entities.Tag;
import org.mai.roombooking.repositories.GroupRepository;
import org.mai.roombooking.repositories.TagRepository;
import org.mai.roombooking.services.AuthService;
import org.mai.roombooking.services.RoomService;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

@Component
@Slf4j
@AllArgsConstructor
public class RunScriptBaseInit {

    private final RoomService roomService;
    private final TagRepository tagRepository;
    private final GroupRepository groupRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void runAfterStartup() {
        addRooms();
        addTags();
    }

    private void addRooms() {
        var rooms = Arrays.asList(
                Room.builder().roomName("IT-6") .hasComputers(false).hasProjector(true) .isCathedral(true).capacity(50).build(),
                Room.builder().roomName("IT-10").hasComputers(false).hasProjector(false).isCathedral(true).capacity(10).build(),
                Room.builder().roomName("IT-11").hasComputers(false).hasProjector(true) .isCathedral(true).capacity(25).build());

        for (var room : rooms) {
            if (roomService.getRoomByName(room.getRoomName()).isEmpty()) {
                roomService.update(new RoomDTO(room));
                log.info("saved entity " + room);
            }
        }
    }

    private void addTags() {
        var tags = Arrays.asList(
                Tag.builder().color("#bde0fe").fullName("Лекция").shortName("ЛК").build(),
                Tag.builder().color("#fcf6bd").fullName("Экзамен").shortName("Экз").build(),
                Tag.builder().color("#ff91f2").fullName("Встреча").shortName("ВС").build(),
                Tag.builder().color("#ff8fab").fullName("Практика").shortName("ПЗ").build(),
                Tag.builder().color("#ded6d1").fullName("Совещание").shortName("СВ").build()
                );

        for (var tag : tags) {
            if (tagRepository.findByFullName(tag.getFullName()).isEmpty()) {
                tagRepository.save(tag);
                log.info("sav entity {}", tag);
            }
        }
    }

    private void addGroups() {
        var groups = Arrays.asList(
                Group.builder().name("М80-410Б-20").size(15).specialty("no").build(),
                Group.builder().name("М80-411Б-20").size(20).specialty("no").build(),
                Group.builder().name("М80-406Б-20").size(17).specialty("no").build(),
                Group.builder().name("М80-407Б-20").size(16).specialty("no").build(),
                Group.builder().name("М80-408Б-20").size(19).specialty("no").build(),
                Group.builder().name("М80-409Б-20").size(25).specialty("no").build()
        );

        for (var group : groups) {
            if (groupRepository.findByName(group.getName()).isEmpty()) {
                groupRepository.save(group);
                log.info("sav entity {}", group);
            }
        }
    }
}
