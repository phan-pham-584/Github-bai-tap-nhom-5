import java.util.ArrayList;
import java.util.List;

public class TeamManagement {
    private List<Team> teamList = new ArrayList<>();

    public TeamManagement() {}

    public void addTeam(Team team) {
        teamList.add(team);
    }

    public void removeTeam(Team team) {
        teamList.removeIf(t -> t.equals(team));
    }

    public void setTeamList(List<Team> teamList) {
        this.teamList = teamList;
    }

    public List<Team> getTeamList() {
        return teamList;
    }
}
