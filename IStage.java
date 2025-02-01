package lab;

public interface IStage {
    Stage next();
    Stage prev();
    void start();
    void stop();

}
