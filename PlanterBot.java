public class PlanterBot extends Robot implements FarmingRobot {
    public PlanterBot(String name) {
        super(name);
    }

    @Override
    public String Harvest() {
        return "Plant";
    }

    @Override
    public String Process() {
        return "Healthy Food?";
    }
}
