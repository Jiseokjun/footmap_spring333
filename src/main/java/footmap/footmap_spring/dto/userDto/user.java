package footmap.footmap_spring.dto.userDto;

//src/main/java/dto/UserDto.java
//자신의 DB에 존재하는 Table 정보와 맞추자
//DTO파일명은 mapper.xml의 resultType과 맞춰주자.

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class user {
    private String  u_code;
    private String  u_id;
    private String  u_pw;
    private String  u_name;
    private String  u_nick;
    private int     u_birth;
    private String  u_tel;
    private String  u_mail;
    private int     u_assi;
    private int     u_goal;
    private int     u_cut;
    private int     u_sex;


}
