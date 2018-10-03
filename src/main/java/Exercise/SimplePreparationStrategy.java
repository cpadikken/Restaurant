package Exercise;

public class SimplePreparationStrategy extends PreparationStrategy {

    SimplePreparationStrategy() {
        this.name = "simple preparation";
    }

    @Override
    public void execute(){
        System.out.print("put an apron on");
    }
}
