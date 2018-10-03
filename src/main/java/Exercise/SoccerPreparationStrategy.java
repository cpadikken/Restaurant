package Exercise;

public class SoccerPreparationStrategy extends PreparationStrategy {

    private String name = "soccer preparation";

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void execute(){
        System.out.print("open a beer and hum the anthem of favourite soccer team");
    }
}
