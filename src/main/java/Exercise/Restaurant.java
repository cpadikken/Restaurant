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
        for (int i = cooks.size() - 1; i >= 0; i --){
            if (cooks.get(i).getPreparation().getName() == preparation){
                cooks.remove(i);
            }
        }
    }

    public void prepareCooks(){
        for (Cook c : cooks){
            c.prepare();
        }
    }
}
