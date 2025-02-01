package lab;

public class Walls extends Stage {

    public Walls(int cost, String startDate, String endDate) throws DateException {
        super("Возведение стен", cost, startDate, endDate);
    }

    @Override
    public void reject() {

    }

}
