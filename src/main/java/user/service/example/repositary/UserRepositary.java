package user.service.example.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import user.service.example.entity.UserData;

public interface UserRepositary extends JpaRepository<UserData,Long> {
    UserData findByUserId(Long userId);
}
