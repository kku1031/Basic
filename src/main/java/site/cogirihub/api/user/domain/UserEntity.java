package site.cogirihub.api.user.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
    private String createdAt;
    

}
