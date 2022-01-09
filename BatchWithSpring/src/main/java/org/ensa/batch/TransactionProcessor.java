package org.ensa.batch;

import org.ensa.entities.Transactione;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;

@Service("transactionProcessor")
public class TransactionProcessor implements ItemProcessor<Transactione, Transactione>{

	public Transactione process(Transactione item) throws Exception {
		// TODO Auto-generated method stub
		return item;
	}

}
