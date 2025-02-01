package lab;

class Foundation extends Stage {
    public Foundation(int cost, String startDate, String endDate) throws DateException {
        super("Фундамент", cost, startDate, endDate);
    }

    @Override
    public void reject() {

    }
}

