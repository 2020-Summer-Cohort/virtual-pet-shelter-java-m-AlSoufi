package shelter;

public class VirtualPet {
    private String name;
    private String desc;
    private int hunger = 100;
    private int thirst = 100;
    private int boredom = 100;


    public VirtualPet(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }



    public void feeding() {
        hunger -= 35;

    }

    public void watering() {
        thirst -= 35;

    }

    public void playing() {
        boredom -= 15;

    }

    public void tick() {
        hunger += 5;
        thirst += 5;
        boredom += 5;
    }


}



