package footmap.footmap_spring.dao.teamDao;

import footmap.footmap_spring.dto.teamDto.team;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeamMapper {

    List<team> getTeamList();
}
