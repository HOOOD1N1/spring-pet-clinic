package com.springframework.edypetclinic.bootstrap;

import com.springframework.edypetclinic.model.Owner;
import com.springframework.edypetclinic.model.Vet;
import com.springframework.edypetclinic.services.OwnerService;
import com.springframework.edypetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader(OwnerService ownerService, VetService vetService){
    this.ownerService = ownerService;
    this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
    Owner owner1 = new Owner();
    owner1.setId(1L);
    owner1.setFirstName("edy");
    owner1.setLastName("d");
    ownerService.save(owner1);

    Owner owner2 = new Owner();
    owner2.setId(1L);
    owner2.setFirstName("ra");
    owner2.setLastName("hom");
    ownerService.save(owner2);

        System.out.println("Loading Owners....");

    Vet vet1 = new Vet();
    vet1.setId(1L);
    vet1.setFirstName("Chris");
    vet1.setLastName("Don");
    vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(1L);
        vet2.setFirstName("Hall");
        vet2.setLastName("Ham");
        vetService.save(vet2);


        System.out.println("Loading Vets....");
    }
}
