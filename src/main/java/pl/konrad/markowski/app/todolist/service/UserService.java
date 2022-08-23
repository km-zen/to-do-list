package pl.konrad.markowski.app.todolist.service;

import org.springframework.stereotype.Service;
import pl.konrad.markowski.app.todolist.repository.entity.UserRepository;

import java.util.logging.Logger;

@Service
public class UserService {
    private static Logger LOGGER = Logger.getLogger(UserService.class.getName());

    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

}
