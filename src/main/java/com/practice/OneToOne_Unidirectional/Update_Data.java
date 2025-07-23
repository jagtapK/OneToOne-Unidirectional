package com.practice.OneToOne_Unidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Mapping.Entity.Teacher;
import Mappint.Utility.MappingUtility;

public class Update_Data {

	public static void main(String[] args) {
		SessionFactory factory = MappingUtility.getSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		
		Teacher t1 = session.find(Teacher.class, 3);
		t1.setName("Kajal");
		t1.setDepartment("CS");
		
		t1.getPrincipal().setPhoneNo("4567890");
		
		transaction.commit();
		session.close();
	}
}
