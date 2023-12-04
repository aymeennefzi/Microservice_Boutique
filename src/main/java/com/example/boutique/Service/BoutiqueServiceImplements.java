package com.example.boutique.Service;

import com.example.boutique.Entity.Boutique;
import com.example.boutique.Repository.IBoutiqueRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class BoutiqueServiceImplements implements IBoutiqueService {

    private final IBoutiqueRepo iBoutiqueRepo ;
    @Override
    public Boutique ajouterBoutique(Boutique boutique) {
        return iBoutiqueRepo.save(boutique);
    }

    @Override
    public Boutique updateBoutique(Boutique boutique) {
        return iBoutiqueRepo.save(boutique);
    }


    @Override
    public Boutique getBoutiqueById(long idB) {
       return iBoutiqueRepo.findById(idB).orElse(null);
    }

    @Override
    public List<Boutique> getAllBoutique() {
        return iBoutiqueRepo.findAll();
    }



    @Override
    public List<Boutique> getallBoutiquesInCentre(long idCentre) {
        return iBoutiqueRepo.findAllByIdCentre(idCentre);
    }
//    public void ajouterEtaffecterListeboutiques(List<Boutique> lb, Long idCentre) {
//
//    }


}
