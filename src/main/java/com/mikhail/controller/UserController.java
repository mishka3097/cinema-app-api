package com.mikhail.controller;

import com.mikhail.dto.user.UserFullInfoDtoOut;
import com.mikhail.dto.user.UserLiteDtoOut;
import com.mikhail.dto.user.UserRegInfoDtoIn;
import com.mikhail.dto.user.UserUpdateInfo;
import com.mikhail.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl userServiceImpl;

    @GetMapping("/users/{id}")
    public UserFullInfoDtoOut findById(@PathVariable final Long id) {
        return userServiceImpl.findUserById(id);
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserLiteDtoOut>> getAllUsers() {
        return ResponseEntity.ok().body(userServiceImpl.getAll());
    }

    @PostMapping(value = "/user/register")
    public ResponseEntity<Void> registerUser(@Valid final UserRegInfoDtoIn regInfoDtoIn) {
        userServiceImpl.registerUser(regInfoDtoIn);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable final Long id) {
        userServiceImpl.deleteUserById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<Void> updateUser(@PathVariable final Long id,
                                           @RequestBody @Valid final UserUpdateInfo updateInfo) {
        userServiceImpl.updateUser(id, updateInfo);
        return ResponseEntity.ok().build();
    }
}
