package com.EComm.Service;

import java.util.List;



import com.EComm.entities.Produit;
import com.EComm.entities.User;

public interface IProduitService {

	List<Produit> findAllProduit();

	Produit saveProduit(Produit pro);
	
	Produit updateProduit (Long id ,Produit pro);
	
	void deleteProduit (Long id);

}
