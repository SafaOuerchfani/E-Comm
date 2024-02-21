package com.EComm.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EComm.entities.*;
@Repository
public interface ProduitRepository extends JpaRepository<Produit,Long> {

}
