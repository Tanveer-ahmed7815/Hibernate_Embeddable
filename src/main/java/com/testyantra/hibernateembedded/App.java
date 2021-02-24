package com.testyantra.hibernateembedded;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.testyantra.dtos.Address;
import com.testyantra.dtos.Student;

public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentDB");
        
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Address address = new Address();
        address.setAddressId(102);
        address.setLane("2rd Main");
        address.setStreet("HBR");
        address.setType("Permanent");
        
        Address addressTwo = new Address();
        addressTwo.setAddressId(103);
        addressTwo.setLane("1st cross");
        addressTwo.setStreet("Banaswadi");
        addressTwo.setType("Temporary");
        List<Address> list = new ArrayList<>();
        list.add(address);
        list.add(addressTwo);
        
        Student student = new Student();
        student.setStudentId(104);
        student.setStudentName("Syed");
        student.setList(list);
        
        //em.persist(address);
        //no need to persist address as its not an entity in this case
        em.persist(student);
        
        em.getTransaction().commit();
        
        em.close();
        
        emf.close();
    }
}
