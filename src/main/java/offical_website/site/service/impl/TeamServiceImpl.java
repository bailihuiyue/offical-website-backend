package offical_website.site.service.impl;

import offical_website.site.dao.TeamMapper;
import offical_website.site.model.Team;
import offical_website.site.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    TeamMapper teamMapper;

    @Override
    public int createTeam(String remark, String img) {
        int team = teamMapper.createTeam(remark, img);
        return team;
    }

    @Override
    public int deleteTeam(long id) {
        int team = teamMapper.deleteTeam(id);
        return team;
    }

    @Override
    public int updateTeam(String remark, long id, String img) {
        int team = teamMapper.updateTeam(remark, id, img);
        return team;
    }

    @Override
    public List<Team> getTeamAll() {
        List<Team> team = teamMapper.getTeamAll();
        return team;
    }

    @Override
    public Team getTeamById(long id) {
        Team team = teamMapper.getTeamById(id);
        return team;
    }
}