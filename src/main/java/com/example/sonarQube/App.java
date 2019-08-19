package com.example.sonarQube;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
//        System.out.println( "Hello World!" );

    
	public void m1() {
		// String s = "";
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list=null;
		list.add(2);

		Object obj = getData();
		if (obj != null) {
			System.out.println(obj.toString());
		}
	}

	public Object getData() {
		return null;
	}

	public static void main(String[] args) {
		// System.out.println( "Hello World!" );

		App app = new App();
		app.m1();
	}
}
