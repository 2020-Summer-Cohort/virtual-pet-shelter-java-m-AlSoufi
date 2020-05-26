package shelter;


import java.util.HashMap;
import java.util.Map;

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

