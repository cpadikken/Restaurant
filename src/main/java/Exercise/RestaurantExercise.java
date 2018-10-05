package Exercise;

public class RestaurantExercise {

    public static void main(String args[]){
        Restaurant r = new Restaurant ("Charlie's Corner");

        Cook Christian = new Cook ("Christian", new SimplePreparationStrategy());
        Cook Peter = new Cook ("Peter", new HardrockPreparationStrategy());
        Cook Maria = new Cook ("Maria", new SoccerPreparationStrategy());
        Cook Rody = new Cook ("Rody", new SoccerPreparationStrategy());

        r.addCook(Christian);
        r.addCook(Peter);
        r.addCook(Maria);
        r.addCook(Rody);

        r.prepareCooks();

        r.removeAllCooksWithPreparationType("soccer preparation");
        r.prepareCooks();

        Cook Daan = new Cook ("Daan", new MeditationPreparationStrategy());
        r.addCook(Daan);

        r.replaceExisitngCookWithNewCook(Peter, "Michel");
        r.prepareCooks();
    }
}