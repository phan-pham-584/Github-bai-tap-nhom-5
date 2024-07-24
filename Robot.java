public class Robot {
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

    public boolean equals(Robot r) {
        if(this.name.equals(r.getName())) {
            return true;
        }
        return false;
    }
}
