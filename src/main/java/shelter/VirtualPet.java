package shelter;

public class VirtualPet {
    private String name;
    private String desc;
    private int hunger;
    private int thirst;
    private int boredom;


    public VirtualPet(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }


    public VirtualPet(String name, String desc, int hunger, int thirst, int boredom) {
        this.name = name;
        this.desc = desc;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;

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
        System.out.println(hunger -= 35);

    }

    public void watering() {
        System.out.println(thirst -= 35);

    }

    public void playing() {
        System.out.println(boredom -= 15);

    }

    public void playWithPet(){
        boredom -= 10;
    }

    public void tick() {
        hunger += 5;
        thirst += 5;
        boredom += 5;
    }


}



