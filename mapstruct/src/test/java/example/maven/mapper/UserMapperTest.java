package example.maven.mapper;

import example.maven.domain.User;
import example.maven.model.UserCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserMapperTest {

    private UserMapper userMapper = UserMapper.INSTANCE;

    @Test
    void userToUserCommand() {
        // given
        User user = new User();
        user.setFirstname("John");
        user.setLastname("Doe");
        user.setEmail("todamoon@abc.com");

        // when
        UserCommand userCommand = userMapper.userToUserCommand(user);

        // inspect
        assertEquals(user.getFirstname(), userCommand.getFirstname());
        assertEquals(user.getLastname(), userCommand.getLastname());
        assertEquals(user.getEmail(), userCommand.getEmail());
    }

    @Test
    void userCommandToUser() {
        // given
        UserCommand userCommand = new UserCommand();
        userCommand.setFirstname("John");
        userCommand.setLastname("Doe");
        userCommand.setEmail("todamoon@abc.com");

        // when
        User user = userMapper.userCommandToUser(userCommand);

        // inspect
        assertEquals(userCommand.getFirstname(), user.getFirstname());
        assertEquals(userCommand.getLastname(), user.getLastname());
        assertEquals(userCommand.getEmail(), user.getEmail());
    }
}
