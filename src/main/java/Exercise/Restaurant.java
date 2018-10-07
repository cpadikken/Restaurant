package Exercise;

import java.util.*;

public class Restaurant {

    private String name;
    private ArrayList<Cook> cooks;


    public Restaurant (String name){
        this.name = name;
        cooks = new ArrayList<Cook>();
    }

    public void addCook(Cook cook){
        cooks.add(cook);
    }

    public void removeAllCooksWithPreparationType (final String preparation){
        cooks.removeIf((Cook cook) -> cook.getPreparation().getName().equals(preparation));
    }

    public void prepareCooks(){
        for (Cook c : cooks){
            c.prepare();
        }
    }

    public void replaceExistingCookWithNewCook(Cook leavingCook, String name){
        Cook newCook = new Cook(name, leavingCook.getPreparation());
        cooks.add(newCook);
        cooks.remove(leavingCook);
    }
}
