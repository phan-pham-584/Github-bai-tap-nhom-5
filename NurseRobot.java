public class NurseRobot extends Robot implements MedicalReboot {
    public NurseRobot(String name) {
        super(name);
    }

    public String DoStuff() {
        return "NurseRobot is providing medical care.";
    }
}
