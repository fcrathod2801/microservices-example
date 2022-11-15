package user.service.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import user.service.example.entity.UserData;
import user.service.example.repositary.UserRepositary;
import user.service.example.vo.Department;
import user.service.example.vo.ResponseTemplate;

@Service
public class UserService {

    @Autowired
    UserRepositary userRepositary;

    @Autowired
    RestTemplate restTemplate;

    public UserData saveUser(UserData user) {
        return userRepositary.save(user);
    }

    public UserData findByUserId(Long userId) {
        return userRepositary.findByUserId(userId);
    }

    public ResponseTemplate getUserWithDepartment(Long userId) {
        ResponseTemplate vo=new ResponseTemplate();
        UserData user=userRepositary.findByUserId(userId);

        Department department=
                restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(),Department.class);

        vo.setUser(user);
        vo.setDepartment(department);
        return vo;

    }
}
