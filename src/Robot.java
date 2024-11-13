public class Robot {
    String name;
    IBehaviour behaviour;
    public Robot(String name)
    {
        this.name = name;
        this.behaviour = null;
    }
    public Robot(String name, IBehaviour behaviour)
    {
        this.name = name;
        this.behaviour = behaviour;
    }
    public Robot()
    {
        this.name = "sans nom";
    }
    public Robot(Robot other)
    {
        this.name = other.name;
        this.behaviour = other.behaviour;
    }

    public void move()
    {
        this.behaviour.move();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IBehaviour getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(IBehaviour behaviour) {
        this.behaviour = behaviour;
    }
}
