package org.mai.roombooking.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mai.roombooking.services.MetricsService;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Metrics {
    Double averageBookingDuration;
    Double averageRoomPopularityIndex;
    MetricsService.Utilization roomUtilizationFrequency;
    MetricsService.Utilization averageBookingDurationByRoom;
    MetricsService.Utilization averageBookingZapolnennost;
    MetricsService.Utilization roomPopularityIndex;
}