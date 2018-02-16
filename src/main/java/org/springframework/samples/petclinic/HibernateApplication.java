///*
// * Copyright 2002-2014 the original author or authors.
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *      http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//
//package org.springframework.samples.petclinic;
//
//import java.util.ArrayList;
////import java.util.ArrayList;
////import java.util.Date;
//import java.util.List;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
////import org.springframework.samples.petclinic.bill.Bill;
////import org.springframework.samples.petclinic.bill.Bill;
//import org.springframework.samples.petclinic.bill.BillRepository;
//import org.springframework.samples.petclinic.owner.Owner;
//import org.springframework.samples.petclinic.owner.Pet;
//import org.springframework.samples.petclinic.owner.PetRepository;
////import org.springframework.samples.petclinic.visit.Visit;
//import org.springframework.samples.petclinic.visit.VisitRepository;
//
///**
// * PetClinic Spring Boot Application.
// * 
// * @author Dave Syer
// *
// */
//@SpringBootApplication
//public class HibernateApplication implements CommandLineRunner {
//	
//	@Autowired
//	PetRepository petRepository;
//	
//	@Autowired
//	BillRepository billRepository;
//	
//	@Autowired
//	VisitRepository visitRepository;
//	
//
//    public static void main(String[] args) throws Exception {
//        //SpringApplication.run(HibernateApplication.class, args);
//        
//    }
//    
//    
//    
//    @Override
//    @Transactional
//    public void run(String... arg0) {
//    	
//		System.out.println("\n\nPruebas de Hibernate\n=====================\n\n");
//    	
//		Pet p = petRepository.findById(8);
//    	List<Visit> visits = p.getVisits();
//    	
//    	//Añadido de una factura a la segunda visita de la mascota p
//    	Bill facturaPrueba = new Bill();
//    	facturaPrueba.setIdNumber(1234567891);
//    	facturaPrueba.setMoney(1.0);
//    	Date fechaPrueba = new Date();
//    	facturaPrueba.setPaymentDate( fechaPrueba );
//    	List<Bill> listaFacturas = new ArrayList<Bill>();
//    	listaFacturas.add( facturaPrueba );
//    	billRepository.save( listaFacturas );
//    	
//    	visits.get( 1 ).setBill( facturaPrueba );
//    	visitRepository.save( visits.get( 1 ) );
//    	
//    	//Impresión de las visitas y facturas de una mascota
//    	for( Visit v: visits ) {
//    		System.out.println( "Visita: " + v );
//    		if( v.getBill() != null ) System.out.println( "Factura de la visita: " + v.getBill().getIdNumber() );
//    		else System.out.println("Factura de la visita: No existe.");
//    	}
//    	
//    	//Búsqueda del dueño de un perro
//    	String mascota = "George";
//    	int indiceBucle00;
//    	Pet p2;
//    	for( indiceBucle00 = 1; indiceBucle00 < 1000; indiceBucle00++ ) {
//    		p2 = petRepository.findById( indiceBucle00 );
//    		if( p2 != null && p2.getName().equals( mascota ) ) {
//    			indiceBucle00 = 1005;
//    			
//    			Owner owner = p2.getOwner();
//    			System.out.println( "Dueño de la mascota " + mascota + ": " + owner.getFirstName() + " " + owner.getLastName() );
//    		}
//    	}
//    	
//    	if( indiceBucle00 < 1005 ) {
//    		System.out.println( "No se ha encontrado el dueño del perro " + mascota + "." );
//    	}
//    	List<Pet> listPets = new ArrayList<Pet>();
//    	listPets = petRepository.findAll();
//    	
//    	Owner owner;
//    	for( int indiceBucle01 = 0; indiceBucle01 < listPets.size(); indiceBucle01++ ) {
//    		if( mascota.equals( listPets.get( indiceBucle01 ).getName() ) ) {
//    			owner = listPets.get( indiceBucle01 ).getOwner();
//    			if( owner != null ) System.out.println( "Dueño de la mascota " + mascota + ": " + owner.getFirstName() + " " + owner.getLastName() + ".\n" );
//    		}
//    	}
//    }
//}