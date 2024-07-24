import java.util.ArrayList;
import java.util.List;

public class Team {
    protected String name;
    private List<Robot> robotList = new ArrayList<>();

    /**
     * Khoi tạo constuctor.
     * @param name là tên
     */
    public Team(String name) {
        this.name = name;
    }
    
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

    /**
     * So sanh Team dua theo ten.
     * @param obj là object dc so sanh
     * @return giong nhau hay khong
     */
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
