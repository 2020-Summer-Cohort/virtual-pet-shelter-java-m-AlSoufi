package shelter;

import java.util.Scanner;
/*
 * Moe as you continue to work on this application class to meet teh requirements of the project,
 * consider using the shelter object as your main way of interacting with your pets.  You do need to
 * create pet objects like you do in lines 13-16 and then add them to the shelter like in lines 19-22.  But after that
 * use the methods in the shelter to return either all the pets in the shelter, or a specific pet in the shelter.
 * Doing so will allow your app to be more dynamic and provide you with up to date lists of pets that are in
 * the shelter no matter which way the user of the app takes the interactions.
 */

public class VirtualPetShelterApp {
    public static void main(String[] args) {

        VirtualPet pet1 = new VirtualPet("Joey", "Frisky", 20, 20, 20);
        VirtualPet pet2 = new VirtualPet("Jordy", "Fuzzy", 20, 20, 20);
        VirtualPet pet3 = new VirtualPet("Jerry", "Orange", 20, 20, 20);
        VirtualPet pet4 = new VirtualPet("Bubbles", "Lazy", 20, 20, 20);

        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.addPet(pet1);
        shelter.addPet(pet2);
        shelter.addPet(pet3);
        shelter.addPet(pet4);
        shelter.adoptPet(pet1);
        shelter.adoptPet(pet2);
        shelter.adoptPet(pet3);
        shelter.adoptPet(pet4);

        System.out.println("Thank you for volunteering at The Neighborhood Virtual Pet Shelter!");
        System.out.println();



        System.out.println("This is the status of our pets currently:");
        System.out.println("Name	|   Hunger	|   Thirst	|  Boredom");
        System.out.println("--------|-----------|-----------|----------");
        System.out.println(pet1.getName() + "    |      " + pet1.getHunger() + "   |     " + pet1.getThirst() + "    |   " + pet1.getBoredom());
        System.out.println(pet2.getName() + "   |      " + pet2.getHunger() + "   |     " + pet2.getThirst() + "    |   " + pet2.getBoredom());
        System.out.println(pet3.getName() + "   |      " + pet3.getHunger() + "   |     " + pet3.getThirst() + "    |   " + pet3.getBoredom());
        System.out.println(pet4.getName() + " |      " + pet4.getHunger() + "   |     " + pet4.getThirst() + "    |   " + pet4.getBoredom());
        System.out.println("What would you like to do next?");
        System.out.println("1. Feed the pets");
        System.out.println("2. Water the pets");
        System.out.println("3. Play with a pet");
        System.out.println("4. Adopt a pet");
        System.out.println("5. Admit a pet");
        System.out.println("6. Quit");



        while(true){

        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();








    }
}
