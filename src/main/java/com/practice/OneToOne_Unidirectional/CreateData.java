package com.practice.OneToOne_Unidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Mapping.Entity.Principal;
import Mapping.Entity.Teacher;
import Mappint.Utility.MappingUtility;

public class CreateData {

	public static void main(String[] args) {

		SessionFactory factory = MappingUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Principal p1 = new Principal();
		p1.setName("Alice");
		p1.setPhoneNo("20013467");

		Teacher te = new Teacher();
		te.setName("Sham");
		te.setDepartment("Eelctronics");
		te.setPrincipal(p1);

		session.persist(te);

		transaction.commit();
		session.close();

	}
}
