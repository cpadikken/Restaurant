package Exercise;

public class HardrockPreparationStrategy extends PreparationStrategy {

    public HardrockPreparationStrategy() {
        this.name = "hardrock preparation";
    }

    @Override
    public void execute(){
        System.out.print("take a collection of knifes and set some hardrock music on");
    }

}
