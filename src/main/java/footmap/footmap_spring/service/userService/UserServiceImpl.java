package footmap.footmap_spring.service.userService;

import footmap.footmap_spring.dao.userDao.UserMapper;
import footmap.footmap_spring.dto.userDto.user;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    @Override
    public List<user> getUserList() {
        System.out.println("서비스입플" + userMapper.getUserList());
        return userMapper.getUserList();

    }
}
