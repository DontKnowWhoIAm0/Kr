package lab;

import java.util.Random;

public class Construction implements IConstrustion {

    private Stage currentStage;
    private final Random random = new Random();

    public Construction(int projectCost, int foundationCost, int wallCalls, int roofCalls, int finishCalls, String startDate, String endDate) throws DateException {
        Project project = new Project(projectCost, startDate, endDate);
        Foundation foundation = new Foundation(foundationCost, startDate, endDate);
        Walls walls = new Walls(wallCalls, startDate, endDate);
        Roof roof = new Roof(roofCalls, startDate, endDate);
        Finish finish = new Finish(finishCalls, startDate, endDate);

        project.nextStage = foundation;
        foundation.prevStage = project;
        foundation.nextStage = walls;
        walls.prevStage = foundation;
        walls.nextStage = roof;
        roof.prevStage = walls;
        roof.nextStage = finish;
        finish.prevStage = roof;

        this.currentStage = project;
    }

    @Override
    public void startConstruction() {
        while (currentStage != null) {
            currentStage.start();
            if (random.nextInt(10) == 0) {
                currentStage.reject();
                if (currentStage.prev() == null) {
                    System.out.println("Проект забракован. Стройка отменена.");
                    return;
                }
                currentStage = currentStage.prev();
            } else {
                currentStage.stop();
                currentStage = currentStage.next();
            }
        }
        finishConstruction();
    }

    @Override
    public void finishConstruction() {
        System.out.println("Стройка успешно завершена!");
    }
}
