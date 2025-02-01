package lab;

public class Roof extends Stage {

    public Roof(int cost, String startDate, String endDate) throws DateException {
        super("Возведение крыши", cost, startDate, endDate);
    }

    @Override
    public void reject() {

    }
}
