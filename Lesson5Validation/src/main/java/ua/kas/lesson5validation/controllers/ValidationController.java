package ua.kas.lesson5validation.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ua.kas.lesson5validation.dto.PutUserRequest;
import ua.kas.lesson5validation.dto.UserDto;
import ua.kas.lesson5validation.storage.UserStorage;

@RestController
public class ValidationController {
    private UserStorage userStorage;

    public ValidationController(UserStorage userStorage) {
        this.userStorage = userStorage;
    }

    @RequestMapping(path = "/getUser", method = RequestMethod.GET)
    public UserDto getUserById(@RequestParam(value = "id") int id) {
        return userStorage.getUserById(id);
    }

    @RequestMapping(path = "/user", method = RequestMethod.PUT)
    public ResponseEntity putUser(@Validated @RequestBody PutUserRequest putUserRequest) {
        userStorage.putUser(putUserRequest);
        return new ResponseEntity(HttpStatus.OK);

    }
}
