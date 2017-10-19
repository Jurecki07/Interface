package stuff;

public abstract class Soldier implements ArmedAssault, Artillery {
    protected String name;
    protected String Rank;
    protected int serialNumber;
    protected int steps = 0;
    protected boolean hungry;
    protected boolean tired;


    protected String speak(){
        System.out.println("HOORRAAHH");
        return speak();
    }

    protected String march(){
        this.steps += 1;
        System.out.println("Marching");
        return march();

    }
    protected String sleepyTime(){
        this.tired = true;
        System.out.println("Can't move another inch");
        return sleepyTime();
    }
    protected String stuffFace(){
        this.hungry = true;
        System.out.println("Pork and beans AGAIN??");

        return stuffFace();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return Rank;
    }

    public void setRank(String rank) {
        Rank = rank;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
}

