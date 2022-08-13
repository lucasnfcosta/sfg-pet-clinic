package guru.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {
    
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Lucas");
        owner1.setLastName("Costa");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Gabriel");
        owner2.setLastName("Campos");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Fofa");
        vet1.setLastName("Valverde");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Floquinho");
        vet2.setLastName("Valverde");

        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }

    
}
