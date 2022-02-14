package com.springframework.edypetclinic.bootstrap;

import com.springframework.edypetclinic.model.Owner;
import com.springframework.edypetclinic.model.PetType;
import com.springframework.edypetclinic.model.Vet;
import com.springframework.edypetclinic.services.OwnerService;
import com.springframework.edypetclinic.services.PetTypeService;
import com.springframework.edypetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService){
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);


        Owner owner1 = new Owner();
        owner1.setFirstName("Eduard");
        owner1.setLastName("Drob");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Ra");
        owner2.setLastName("Hom");
        ownerService.save(owner2);

        System.out.println("Loading Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Chris");
        vet1.setLastName("Don");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Hall");
        vet2.setLastName("Ham");
        vetService.save(vet2);


        System.out.println("Loading Vets....");
    }
}
