package com.EComm.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EComm.entities.Produit;
import com.EComm.Service.*;

@RestController
@RequestMapping("/api")
public class ProduitController {
	
	@Autowired 
	IProduitService pserv;
	
	@GetMapping("/projects")
	public List<Produit> getAllProject() {
		List<Produit> pro = pserv.findAllProduit();

        return pro;
	    
	}
	
	@PostMapping("/addproject")
	public Produit createProject(@Valid @RequestBody Produit pro) {
	    return pserv.saveProduit(pro);
	}

}
