package com.EComm.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EComm.entities.Produit;
import com.EComm.Repository.ProduitRepository;

@Service
public class ProduitService implements IProduitService{

	
	@Autowired
	ProduitRepository prepo;

	@Override
	public List<Produit> findAllProduit(){
		// TODO Auto-generated method stub
		return prepo.findAll();
	}

	@Override
	public Produit saveProduit(Produit pro) {
		// TODO Auto-generated method stub
		return prepo.save(pro);
	}
	
	@Override
	public Produit updateProduit (Long id ,Produit pro) {
	// TODO Auto-generated method stub
			return prepo.update(id,pro);
	
	/*@Override
	public void deleteProduit (Long id) {
		// TODO Auto-generated method stub*/
					
		
	}
	
}
