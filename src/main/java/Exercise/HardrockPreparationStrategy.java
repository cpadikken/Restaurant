package Exercise;

public class HardrockPreparationStrategy extends PreparationStrategy {

    private String name = "hardrock preparation";

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void execute(){
        System.out.print("take a collection of knifes and set some hardrock music on");
    }

}
