import java.util.ArrayList;
import java.util.List;

public class TeamManagement {
    private List<Team> teamList = new ArrayList<>();

    public TeamManagement() {}

    /**
     * Them nhom vao.
     * @param team là nhóm đc đưa vào
     */
    public void addTeam(Team team) {
        teamList.add(team);
    }

    /**
     * Xóa team dựa theo tên.
     * @param team là nhóm
     */
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
