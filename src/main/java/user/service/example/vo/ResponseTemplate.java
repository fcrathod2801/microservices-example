package user.service.example.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import user.service.example.entity.UserData;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplate {

    UserData user;
    Department department;

}
