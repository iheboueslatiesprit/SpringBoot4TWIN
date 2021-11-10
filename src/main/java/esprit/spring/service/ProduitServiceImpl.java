package esprit.spring.service;


import esprit.spring.entities.DetailProduit;
import esprit.spring.entities.Produit;
import esprit.spring.entities.Rayon;
import esprit.spring.entities.Stock;
import esprit.spring.repository.RayonRepository;
import esprit.spring.repository.StockRepository;

import esprit.spring.repository.DetailProduitRepository;
import esprit.spring.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl implements ProduitService{
    @Autowired
    ProduitRepository produitRepo;

    @Autowired
    RayonRepository rayonRepo;
    @Autowired
    StockRepository stockRepo;
    @Autowired
    DetailProduitRepository detailProduitRepo;


    @Override
    public List<Produit> retrieveAllProduits() {
        return produitRepo.findAll();
    }

    @Override
    public Produit addProduit(Produit p, Long idRayon, Long idStock) {
        Rayon r = rayonRepo.getById(idRayon);
        Stock s = stockRepo.getById(idStock);

        Produit produit = p ;
        produit.setRayon(r);
        produit.setStock(s);
       // produit.setFournisseur AJOUT STATIQUE EN TEST

        DetailProduit dp = p.getDetailProduit();
        detailProduitRepo.save(dp);
        return produitRepo.save(produit);

    }

    @Override
    public Produit retrieveProduit(Long id) {
        return produitRepo.getById(id);
    }
}
