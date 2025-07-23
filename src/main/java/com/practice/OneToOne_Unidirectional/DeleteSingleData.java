package com.practice.OneToOne_Unidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Mapping.Entity.Teacher;
import Mappint.Utility.MappingUtility;

public class DeleteSingleData {

	public static void main(String[] args) {
		SessionFactory factory = MappingUtility.getSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		
		Teacher t = session.find(Teacher.class, 2);
        session.remove(t);
		
		transaction.commit();
		session.close();
	}
}
