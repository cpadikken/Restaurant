package Exercise;

public class PreparationFactory {
    public static PreparationStrategy getPreparationStrategy(PreparationType preparationType){
        switch(preparationType){
            case SIMPLE : {
                return new SimplePreparationStrategy();
            }
            case SOCCER : {
                return new SoccerPreparationStrategy();
            }
            case HARDROCK : {
                return new HardrockPreparationStrategy();
            }
            case MEDITATION : {
                return new MeditationPreparationStrategy();
            }
            default : {
                return null;
            }
        }
    }
}