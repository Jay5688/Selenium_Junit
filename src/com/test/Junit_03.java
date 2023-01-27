package com.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit_03 {

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
