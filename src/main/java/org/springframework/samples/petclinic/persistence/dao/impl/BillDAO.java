package org.springframework.samples.petclinic.persistence.dao.impl;

import org.springframework.samples.petclinic.bill.Bill;
import org.springframework.samples.petclinic.persistence.dao.IBillDAO;
import org.springframework.stereotype.Repository;

@Repository
public class BillDAO extends AbstractJpaDAO<Bill, Integer> implements IBillDAO {
	
}
