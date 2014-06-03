package com.leo.han.junit.sample;

import com.leo.han.junit.Test;
import com.leo.han.junit.TestInfo;

@TestInfo
public class TestSample {

	
	@Test(enabled = true)
	public void test1(){
		
		throw new RuntimeException("test1 exception");
	}
	
	@Test(enabled = false)
	public void test2(){
		
		throw new RuntimeException("test2 exception");
	}
	
	
	@Test(enabled = true)
	public void test3(){
		
	}
	
	
	@Test(enabled = false)
	public void test4(){
		
	}
}
