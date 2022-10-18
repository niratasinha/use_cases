package com.country.CRUD;

import java.util.List;
import org.springframework.test.context.junit4.SpringRunner;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;



@RunWith(SpringRunner.class)
@SpringBootTest
	public class EmployeeServiceUnitTest{
		private EmployeeService employeejpa;
	@Test
		public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
		List <EmployeeEntity> ee = employeejpa.list();
		Assert.assertEquals(ee.size(), 5);
		}}
			
	