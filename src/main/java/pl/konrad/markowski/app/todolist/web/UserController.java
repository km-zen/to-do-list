package pl.konrad.markowski.app.todolist.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Controller
@RequestMapping
public class UserController {

    private static final Logger LOGGER = Logger.getLogger(UserController.class.getName());

    //Create View
    @GetMapping
    public String createView(){
        LOGGER.info("createView()");
        return "create-user";
    }

    //C - create
    public void create(){
    }

    // R - read
    public void read() {
    }

    // U - update
    public void update() {
    }

    // D - delete
    public void delete() {
    }

    // L - list
    public void list() {
    }

}
