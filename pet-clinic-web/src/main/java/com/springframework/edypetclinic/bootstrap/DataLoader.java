package com.springframework.edypetclinic.bootstrap;

import com.springframework.edypetclinic.model.Owner;
import com.springframework.edypetclinic.model.Pet;
import com.springframework.edypetclinic.model.PetType;
import com.springframework.edypetclinic.model.Vet;
import com.springframework.edypetclinic.services.OwnerService;
import com.springframework.edypetclinic.services.PetTypeService;
import com.springframework.edypetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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
        owner1.setAddress("123 Bricklerel");
        owner1.setCity("Miami");
        owner1.setTelephone("123123123");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rascall");
        owner1.getPets().add(mikesPet);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Ra");
        owner2.setLastName("Hom");
        owner2.setAddress("123 Bricklerel");
        owner2.setCity("Miami");
        owner2.setTelephone("123123123");
        ownerService.save(owner2);

        System.out.println("Loading Owners....");


        Pet fionasCat = new Pet();
        fionasCat.setPetType(savedCatPetType);
        fionasCat.setName("Just cat");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setName("Streety");
        owner2.getPets().add(fionasCat);
        ownerService.save(owner2);




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
