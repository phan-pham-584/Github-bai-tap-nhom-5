public class NurseRobot extends Robot implements MedicalReboot {
    public NurseRobot(String name) {
        super(name);
    }

    public void care() {
        System.out.println(super.getName() + " is assisting with medical care.");
    }
}
