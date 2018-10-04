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

    public void removeAllCooksWithPreparationType (String preparation){
        Iterator<Cook> iterator = cooks.iterator();
        while (iterator.hasNext()) {
            Cook cook = iterator.next();
            if (cook.getPreparation().getName().equals(preparation)) {
                iterator.remove();
            }
        }
    }

    public void prepareCooks(){
        for (Cook c : cooks){
            c.prepare();
        }
    }
}
