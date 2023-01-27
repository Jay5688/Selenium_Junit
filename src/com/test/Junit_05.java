package com.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class Junit_05 {
	public String name; 
	public int Age;
	public Junit_05(String name, int Age) {
		this.name=name;
		this.Age=Age;
	}

	
	@Test
	public void test() {
		System.out.println("Name is "+ name + " and Age is "+Age );
	}
    @Parameters
    public static Collection<Object[]> parameter(){
    	Object [][] data = new Object[3][2];
    	data [0][0]= "Jayakishore";
    	data [0][1]= 44;
    	data [1][0]= "Vasu";
    	data [1][1]= 55;
    	data [2][0]= "Aparna";
    	data [2][1]= 33;
    	return Arrays.asList(data);
    	
    }
}
