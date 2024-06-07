package org.mai.roombooking.events;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mai.roombooking.dtos.RoomDTO;
import org.mai.roombooking.dtos.UserDTO;
import org.mai.roombooking.entities.Room;
import org.mai.roombooking.entities.Tag;
import org.mai.roombooking.entities.User;
import org.mai.roombooking.repositories.TagRepository;
import org.mai.roombooking.security.requestDTO.UserRegistrationRequest;
import org.mai.roombooking.services.AuthService;
import org.mai.roombooking.services.RoomService;
import org.mai.roombooking.services.UserService;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Slf4j
@AllArgsConstructor
public class RunScriptTestInit {

    private final AuthService authService;
    private final UserService userService;

    @EventListener(ApplicationReadyEvent.class)
    public void runAfterStartup() {
        addUsers();
    }

    private void addUsers() {
        var users = Arrays.asList(
        UserDTO.builder().fullName("Авторизованный Пользователь").role(User.UserRole.AUTHORISED).isAccountLocked(false)
                .phoneNumber("+79297016628").username("auth").build(),
        UserDTO.builder().fullName("Преподаватель").role(User.UserRole.TEACHER).isAccountLocked(false)
                .phoneNumber("+79297016620").username("teach").build(),
        UserDTO.builder().fullName("Администратор").role(User.UserRole.ADMINISTRATOR).isAccountLocked(false)
                .phoneNumber("+79297016621").username("admin").build()
        );

        for (var user : users) {
            if (userService.getUserByFullName(user.getFullName()).isEmpty()) {
                authService.registerUser(UserRegistrationRequest.builder().fullName(user.getFullName())
                        .username(user.getUsername()).phoneNumber(user.getPhoneNumber()).password("test").build());
                var regUser = userService.getUserByFullName(user.getFullName()).get();
                regUser.setRole(user.getRole());
                userService.updateUser(regUser);
            }
        }
    }
}
