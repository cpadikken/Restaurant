package Exercise;

public class RestaurantExercise {

    public static void main(String args[]){
        Restaurant r = new Restaurant ("Charlie's Corner");

        Cook Christian = new Cook ("Christian", PreparationFactory.getPreparationStrategy(PreparationType.SIMPLE));
        Cook Peter = new Cook ("Peter", PreparationFactory.getPreparationStrategy(PreparationType.HARDROCK));
        Cook Maria = new Cook ("Maria", PreparationFactory.getPreparationStrategy(PreparationType.SOCCER));
        Cook Rody = new Cook ("Rody", PreparationFactory.getPreparationStrategy(PreparationType.SOCCER));

        r.addCook(Christian);
        r.addCook(Peter);
        r.addCook(Maria);
        r.addCook(Rody);

        r.prepareCooks();

        r.removeAllCooksWithPreparationType("soccer preparation");
        r.prepareCooks();

        Cook Daan = new Cook ("Daan", PreparationFactory.getPreparationStrategy(PreparationType.MEDITATION));
        r.addCook(Daan);

        r.replaceExistingCookWithNewCook(Peter, "Michel");
        r.prepareCooks();
    }
}