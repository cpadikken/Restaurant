package Exercise;

public class SoccerPreparationStrategy extends PreparationStrategy {

    public SoccerPreparationStrategy() {
        this.name = "soccer preparation";
    }

    @Override
    public void execute(){
        System.out.print("open a beer and hum the anthem of favourite soccer team");
    }
}
