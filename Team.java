import java.util.ArrayList;
import java.util.List;

public class Team {
    protected String name;
    private List<Robot> robotList = new ArrayList<>();

    public void addRobot(Robot robot) {
        robotList.add(robot);
    }

    public void removeRobot(Robot robot) {
        robotList.removeIf(t -> t.equals(robot));
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRobotList(List<Robot> robotList) {
        this.robotList = robotList;
    }

    public List<Robot> getRobotList() {
        return robotList;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Team) {
            Team o = (Team) obj;
            return name.equals(o.getName());
        }
        return false;
    }

    public void displayWelcome() {
        System.out.println("***************WELCOME TO***************");
        System.out.println("****************" + name + "*****************");
    }
}
