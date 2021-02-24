package ua.kas.lesson5validation.storage;

import org.springframework.stereotype.Component;
import ua.kas.lesson5validation.dto.PutUserRequest;
import ua.kas.lesson5validation.dto.UserDto;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserStorage {
    private List<UserDto> userDtoList = new ArrayList<>();

    public void putUser(PutUserRequest putUserRequest) {
        long id = userDtoList.size() + 1L;
        userDtoList.add(new UserDto(id,
                putUserRequest.getName(),
                putUserRequest.getSurname(),
                putUserRequest.getLogin(),
                putUserRequest.getPassword(),
                putUserRequest.getEmail()));
    }

    public UserDto getUserById(int id) {
        return userDtoList.get(id);
    }
}
