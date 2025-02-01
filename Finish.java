package lab;

public class Finish extends Stage {

    public Finish(int cost, String startDate, String endDate) throws DateException {
        super("Возведение крыши", cost, startDate, endDate);
    }

    @Override
    public void reject() {

    }
}
