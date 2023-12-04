package com.example.boutique.Service;

import com.example.boutique.Entity.Boutique;

import java.util.List;

public interface IBoutiqueService {
    public Boutique ajouterBoutique ( Boutique boutique);
    public Boutique updateBoutique (Boutique boutique);


    public Boutique getBoutiqueById (long idB);

    public List<Boutique> getAllBoutique();

    List<Boutique> getallBoutiquesInCentre(long idCentre);

//    List<Boutique> listeBoutique(Long idCentre);
//    void ajouterEtaffecterListeboutiques(List<Boutique> lb, Long idCentre);

}
