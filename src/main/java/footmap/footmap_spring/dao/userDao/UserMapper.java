package footmap.footmap_spring.dao.userDao;
//dao파일명은 mybatis-config.xml의 이름과 mapper.xml의 namespace와 맞추기
import footmap.footmap_spring.dto.userDto.user;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<user> getUserList();
}
