package lab;
import java.util.regex.*;

public abstract class Stage implements IStage {
    protected String description;
    protected double cost;
    protected String startDate;
    protected String endDate;
    protected Status status;
    protected Stage prevStage;
    protected Stage nextStage;
    private static Pattern datePattern = Pattern.compile("^(1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31).(1|2|3|4|5|6|7|8|9|10|11|12).\\d{4}$");

    public Stage(String description, double cost, String startDate, String endDate) throws DateException {
        this.description = description;
        this.cost = cost;
        validateDate(startDate);
        validateDate(endDate);
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = Status.PLANNED;
    }

    private void validateDate(String date) throws DateException {
        if (!(datePattern.matcher(date).matches())) {
            throw new DateException();
        }
    }

    @Override
    public Stage next() {
        return nextStage;
    }

    @Override
    public Stage prev() {
        return prevStage;
    }

    @Override
    public void start() {
        status = Status.IN_PROCESS;
    }

    @Override
    public void stop() {
        status = Status.DONE;
    }

    public abstract void reject();

}
