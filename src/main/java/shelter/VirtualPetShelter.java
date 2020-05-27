package shelter;


import java.util.HashMap;
import java.util.Map;

/*
 * Adding a couple methods to meet requirements is the only change to this class I see you need.
 * - retrieveAllPets() -> retrieving all the pets in the shelter, think `return petMap.values()` for the
 *   method body.
 * - retrieveSinglePet(String petName) - retrieving a single pet from the shelter, think
 *   `return petMap.get(petName)` for the method body.
 *
 * This class looks great other than those two missing required methods.
 *
 */
public class VirtualPetShelter {

    Map<String, VirtualPet> petMap = new HashMap<String, VirtualPet>();

    public void addPet(VirtualPet pet) {
        petMap.put(pet.getName(), pet);
    }

    public void adoptPet(VirtualPet pet) {
        petMap.remove(pet.getName(), pet);

    }

    public void feedAllPets() {
        for (VirtualPet petToFeed : petMap.values()) {
            petToFeed.feeding();
        }
    }



    public void waterAllPets() {
        for (VirtualPet petToWater : petMap.values()) {
            petToWater.watering();
        }
    }

    public void playWithAPet() {
        for (VirtualPet petToPlayWith : petMap.values()) {
            petToPlayWith.playing();
        }
    }
    public void tickAll(){

        for(VirtualPet petToTick: petMap.values() ){
            petToTick.tick();
        }
    }
}

