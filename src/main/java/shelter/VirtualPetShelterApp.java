package shelter;

public class VirtualPetShelterApp {
    public static void main(String[] args) {

        VirtualPet pet1 = new VirtualPet("Joey", "Frisky", 20, 20, 20);
        VirtualPet pet2 = new VirtualPet("Jordy", "Fuzzy", 20, 20, 20);
        VirtualPet pet3 = new VirtualPet("Jerry", "Orange", 20, 20, 20);
        VirtualPet pet4 = new VirtualPet("Bubbles", "Lazy", 20, 20, 20);

        System.out.println("Thank you for volunteering at The Neighborhood Virtual Pet Shelter!");
        System.out.println("This is the status of our pets currently:");
        System.out.println("Name	|   Hunger	|   Thirst	|  Boredom");
        System.out.println("--------|-----------|-----------|-------");
        System.out.println(pet1.getName() + "    | " + pet1.getHunger() + "        | " + pet1.getThirst() + "        | " + pet1.getBoredom());
        System.out.println(pet2.getName() + "   | " + pet2.getHunger() + "        | " + pet2.getThirst() + "        | " + pet2.getBoredom());
        System.out.println(pet3.getName() + "   | " + pet3.getHunger() + "        | " + pet3.getThirst() + "        | " + pet3.getBoredom());
        System.out.println(pet4.getName() + " | " + pet4.getHunger() + "        | " + pet4.getThirst() + "        | " + pet4.getBoredom());
        System.out.println("What would you like to do next?");
        System.out.println("1. Feed the pets");
        System.out.println("2. Water the pets");
        System.out.println("3. Play with a pet");
        System.out.println("4. Adopt a pet");
        System.out.println("5. Admit a pet");
        System.out.println("6. Quit");

    }
}
