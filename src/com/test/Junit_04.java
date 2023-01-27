package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit_04 {

	@Before
	public void setUp() throws Exception {
		System.out.println("Im Printing this before test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Im Printing this after test");
	}
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Im Printing this before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Im Printing this After class");
	}
	@Test
	public void test() {
		System.out.println("Im Printing this during test");
		
	}
	@Test
	public void test1() {
		System.out.println("Im Printing this during test1");
	}
	
}
