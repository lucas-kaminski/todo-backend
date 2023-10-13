package me.lucaskaminski.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private IUserRepository userRepository;

  @PostMapping("/")
  public UserModel create(@RequestBody UserModel user) {
    var userCreated = this.userRepository.save(user);
    return userCreated;
  }
}
