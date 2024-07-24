public class DoctorRobot extends Robot implements MedicalReboot {
    public DoctorRobot(String name) {
        super(name);
    }

    public String DoStuff() {
        return "DoctorRobot is providing medical care.";
    }
}
