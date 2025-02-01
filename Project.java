package lab;

class Project extends Stage {
    public Project(int cost, String startDate, String endDate) throws DateException {
        super("Проектирование", cost, startDate, endDate);
    }

    @Override
    public void reject() {

    }
}
