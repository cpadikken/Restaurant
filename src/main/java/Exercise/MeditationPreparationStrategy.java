package Exercise;

public class MeditationPreparationStrategy extends PreparationStrategy {

    MeditationPreparationStrategy() {
        this.name = "meditation preparation";
    }

    @Override
    public void execute(){
        System.out.print("5 minutes of mindfulness and a short breathing exercise");
    }
}
