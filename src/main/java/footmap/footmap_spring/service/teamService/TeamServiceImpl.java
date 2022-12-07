package footmap.footmap_spring.service.teamService;

import footmap.footmap_spring.dao.teamDao.TeamMapper;
import footmap.footmap_spring.dto.teamDto.team;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService {
    private final TeamMapper teamMapper;
    @Override
    public List<team> getTeamList() {
        System.out.println("팀입니다다아" + teamMapper.getTeamList());

        return teamMapper.getTeamList();
    }
}
