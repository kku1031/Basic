package site.cogirihub.api.user.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserVO {
    
    private String id;
    private String name;
    private String email;
    private String password;
    private String createdAt;
     
}
