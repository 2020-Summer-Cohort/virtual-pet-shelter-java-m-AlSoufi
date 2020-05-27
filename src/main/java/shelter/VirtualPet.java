package shelter;
/*
 * See comments in the first constructor, it's the only comment I have on this otherwise good looking class!
 */
public class VirtualPet {
    private String name;
    private String desc;
    private int hunger;
    private int thirst;
    private int boredom;


    public VirtualPet(String name, String desc) {
        this.name = name;
        this.desc = desc;
        /*
         * If you want to add default values for your hunger, thirst and boredom instance variables, here would
         * be a good place to do so.  For example:
         * hunger = 30;
         * thirst = 30
         * boredom = 30
         *
         * Java by default will initialize a primitive int instance variable to 0, but it's best to give it an
         * explicit value to prevent confusion as to what you intended that value to be.
         */
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



