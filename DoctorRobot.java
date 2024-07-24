public class DoctorRobot extends Robot implements MedicalReboot {
    public DoctorRobot(String name) {
        super(name);
    }

    public void care() {
        System.out.println(super.getName() + " is providing medical care.");
    }
}
