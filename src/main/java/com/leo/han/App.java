package com.leo.han;

import com.leo.han.junit.JunitFramework;
import com.leo.han.junit.sample.TestSample;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        JunitFramework.junitParse(TestSample.class);
    }
}
