/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.samples.petclinic;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.samples.petclinic.persistence.dao.IBillDAO;
import org.springframework.samples.petclinic.bill.Bill;
import org.springframework.samples.petclinic.persistence.dao.impl.BillDAO;

/**
 * PetClinic Spring Boot Application.
 * 
 * @author Dave Syer
 *
 */
@SpringBootApplication
public class DAOApplication implements CommandLineRunner {
		
	
	@Autowired
	IBillDAO billDAO;
	

    public static void main(String[] args) throws Exception {
//        SpringApplication.run(DAOApplication.class, args);
        
    }
    
    
    
    @Override
    @Transactional
    public void run(String... arg0) {
    	
//    	Bill bill = new Bill();
//    	
//    	bill.setIdNumber( 456789034 );
//    	bill.setMoney( 34567 );
//    	bill.setPaymentDate( new Date() );
//    	
//    	billDAO.create( bill );
//    	
//    	Bill bill2 = new Bill();
//    	
//    	bill2.setIdNumber( 135723987 );
//    	bill2.setMoney( 92387 );
//    	bill2.setPaymentDate( new Date() );
//    	
//    	billDAO.create( bill2 );
//    	
//    	List<Bill> listBills = billDAO.findAll(  );
//    	
//    	for( Bill b : listBills ) {
//    		System.out.println( "Identificador de la factura: " + b.getIdNumber() + ". Fecha: " + b.getPaymentDate() + ". Pago: " + b.getMoney() + "." );
//    	}
    }

}
