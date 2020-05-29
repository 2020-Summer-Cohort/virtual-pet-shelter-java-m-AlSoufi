package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {

        VirtualPet pet1 = new VirtualPet("Joey", "Frisky");
        VirtualPet pet2 = new VirtualPet("Jordy", "Fuzzy");
        VirtualPet pet3 = new VirtualPet("Jerry", "Orange");
        VirtualPet pet4 = new VirtualPet("Bubbles", "Lazy");

        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.addPet(pet1);
        shelter.addPet(pet2);
        shelter.addPet(pet3);
        shelter.addPet(pet4);


        while (true) {

            System.out.println("Thank you for volunteering at The Neighborhood Virtual Pet Shelter!");
            System.out.println();


            System.out.println("This is the status of our pets currently:");
            System.out.println("Name	|   Hunger	|   Thirst	|  Boredom");
            System.out.println("--------|-----------|-----------|----------");
            for (VirtualPet pet : shelter.petMap.values()) {
                System.out.println(pet.getName() + "    |      " + pet.getHunger() + "   |     " + pet.getThirst() + "    |   " + pet.getBoredom());
            }
            System.out.println("What would you like to do next?");
            System.out.println("1. Feed the pets");
            System.out.println("2. Water the pets");
            System.out.println("3. Play with a pet");
            System.out.println("4. Adopt a pet");
            System.out.println("5. Admit a pet");

            System.out.println("6. Quit");


            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt();
            scanner.nextLine();
            if (userChoice == 1) {
                shelter.feedAllPets();
                System.out.println("You just fed all the pets!");
            } else if (userChoice == 2) {
                shelter.waterAllPets();
                System.out.println("You just gave water to all the pets!");
            } else if (userChoice == 3) {
                System.out.println("Which pet would you like to play with?");
                String selection = scanner.nextLine();
                shelter.playWithAPet(selection);
                System.out.println("You just played with " + selection);
            } else if (userChoice == 4) {
                System.out.println("Please enter the name of the pet you would like to adopt");
                String selection = scanner.nextLine();
                shelter.adoptPet(shelter.findPet(selection));


            } else if (userChoice == 5) {
                System.out.println("Please enter the name of the pet you are admitting ");
                String selection = scanner.nextLine();
                System.out.println("Please enter pet description");
                String petadmitdesc = scanner.nextLine();
                shelter.addPet(new VirtualPet(selection, petadmitdesc));
            } else if (userChoice == 6) {
                System.out.println("Thank you for volunteering at The Neighborhood Virtual Pet Shelter!");
                break;
            }

            shelter.tickAll();
        }
    }
}