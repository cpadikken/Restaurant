package Exercise;

public class SimplePreparationStrategy extends PreparationStrategy {

    private String name = "simple preparation";

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void execute(){
        System.out.print("put an apron on");
    }
}
