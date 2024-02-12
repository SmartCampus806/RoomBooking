package org.mai.roombooking.controllers;

import lombok.AllArgsConstructor;
import org.mai.roombooking.services.Shedule.ScheduleService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/schedule")
@AllArgsConstructor
public class ScheduleController {

    private final ScheduleService scheduleService;

    @PostMapping("/start")
    public void startParsing() {
        scheduleService.updateSchedule("src/main/resources/groups.xlsx");
    }
}
