package com.Epam.Collections;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	CustomList customList = new CustomList();
    	Scanner sc = new Scanner(System.in);
    	int choice;
    	do{
    		System.out.println("Press 1 to add Element\nPress 2 to fetch element at a position\nPress 3 to delete element\nPress 4 to print list\nPress 5 if you want to exit");
    		System.out.print("Enter your choice:");
    	    choice = sc.nextInt();
    	    switch(choice){
    	    case 1:System.out.print("\nEnter a number to add into list:");
    	          int element = sc.nextInt();
    	          customList.addElement(element);
    	          System.out.println("Successfully Added");
    	          break;
    	    case 3:System.out.print("\nEnter a position to delete element from list:");
	          int position = sc.nextInt();
	          System.out.println("Successfully Deleted");
	          customList.deleteElement(position);
	          break;
    	    case 2:System.out.print("\nEnter a position to fetch element from list:");
	          int index = sc.nextInt();
	          System.out.println("Element at index "+index+" is: "+customList.fetchElement(index));
	          break;
    	    case 4: customList.print();
    	    default:break;
    	    }
    	}while(choice < 5);
    	System.out.println("Successfully exited");
    }
}
