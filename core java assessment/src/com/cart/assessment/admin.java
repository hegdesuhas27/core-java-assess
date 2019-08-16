package com.cart.assessment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class admin {

	public static void main(String args[]) {
		boolean contnue=true;
		int choice;
		Scanner sc=new Scanner(System.in);
		
		ArrayList<orders> order= new ArrayList<orders>();
		Map<String, String> custmr = new HashMap<String, String>();
		Map<String, Float> prod= new HashMap<String, Float>();
		
		while(contnue) {
			System.out.println("1)Register customer \n 2)Create a product \n 3)Create an order 4)View order \n 5)exit");
			choice=sc.nextInt();
			switch(choice) {
			case 1: customer cust1=new customer();
			System.out.println("enter name");
					String name=sc.next();
					System.out.println("enter password");
					String pass=sc.next();
					//sc.next();
					custmr.putIfAbsent(name, pass);
//					cust1.setName(name);
//					cust1.setPassword(pass);
//					cust.add(cust1);
					break;
			case 2: product p1=new product();
			System.out.println("enter name");
					String productName=sc.next();
					//sc.next();
					System.out.println("enter price");
					float price=sc.nextFloat();
					//sc.next();
//					p1.setPrice(price);
//					p1.setProductName(productName);
//					prod.add(p1);
					prod.putIfAbsent(productName, price);
					break;	
			case 3: String userName=sc.next();
					sc.next();
					orders o1=new orders();
					if(custmr.containsKey(userName)) {
						String password=sc.nextLine();
						if(custmr.get(userName).equals(password)) {
							System.out.println("logged in");
							boolean yes=true;
							while(yes) {
								for (Map.Entry<String,Float> entry : prod.entrySet())  
						            System.out.println("name= " + entry.getKey() + 
						                             ", price = " + entry.getValue()); 
								System.out.println("enter product name");
								String pname=sc.next();
								sc.next();
								o1.setName(userName);
								o1.setProductName(pname);
								o1.setPrice(prod.get(pname));
								order.add(o1);
								System.out.println("add more?");
								 yes=sc.nextBoolean();
								
							}
						}
					}
					break;
			case 4: for(int i=0;i<5;i++) {
				System.out.println(order.get(i));
			}
			break;
			case 5: contnue=false;
			default:System.out.println("enter something");
					
					
			}
		}
		sc.close();
	}
}

