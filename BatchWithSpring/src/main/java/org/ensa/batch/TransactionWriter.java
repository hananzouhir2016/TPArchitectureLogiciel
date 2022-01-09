package org.ensa.batch;

import java.util.List;

import org.ensa.dao.Dao;
import org.ensa.entities.Transactione;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("transactionWriter")
public class TransactionWriter implements ItemWriter<Transactione>{
	@Autowired
	private Dao dao;
	public void write(List<? extends Transactione> items) throws Exception {
		// TODO Auto-generated method stub
		for(Transactione pr : items){
			dao.ajoutPersonne(pr);
		}
	}

}
