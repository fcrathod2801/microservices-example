package user.service.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/insert")
public class TestController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/")
public String insertValue(){
    jdbcTemplate.execute("insert into userInfo(firstName)values('Avinash')");

    return "Added Successfuly";
}
}
