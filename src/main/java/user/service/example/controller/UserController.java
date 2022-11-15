package user.service.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import user.service.example.entity.UserData;
import user.service.example.service.UserService;
import user.service.example.vo.Department;
import user.service.example.vo.ResponseTemplate;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;



    @PostMapping("/")
    public UserData saveUser(@RequestBody UserData user){
         return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplate getUserWithDepartment(@PathVariable("id") Long userId){
        return userService.getUserWithDepartment(userId);
           }
}
