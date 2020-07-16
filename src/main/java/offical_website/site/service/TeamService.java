package offical_website.site.service;

import offical_website.site.model.Team;

import java.util.List;

public interface TeamService {
    int createTeam(String remark, String img);

    int deleteTeam(long id);

    int updateTeam(String remark, long id, String img);

    List<Team> getTeamAll();

    Team getTeamById(long id);
}