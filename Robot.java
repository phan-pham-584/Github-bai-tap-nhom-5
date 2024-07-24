public abstract class Robot {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public boolean equals(Object obj) {
        if (this == obj) return true;
        
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Robot robot = (Robot) obj;
        
        return name.equals(robot.getName());
    }
}
