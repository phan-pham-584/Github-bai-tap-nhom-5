public class FisherBot extends Robot implements FarmingRobot {
    public FisherBot(String name) {
        super(name);
    }

    @Override
    public String Harvest() {
        return "Fish";
    }

    @Override
    public String Process() {
        return "Sushi";
    }
}
