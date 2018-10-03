package Exercise;

public abstract class PreparationStrategy {
    protected String name;

    PreparationStrategy() {
        this.name = "preparation";
    }

    public String getName() { return name; }

    public abstract void execute();
}
