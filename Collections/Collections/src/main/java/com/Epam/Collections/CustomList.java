package com.Epam.Collections;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
	ArrayList<Integer> list;
	CustomList(){
		list = new ArrayList<Integer>();
		int ar[] = {10,30,40,50,20,60,70,100,90,80};
		for(int i = 0;i < 10; i++)
			list.add(ar[i]);
	}
	public ArrayList<Integer> addElement(int num){
		 list.add(num);
		 return list;
	}
	public ArrayList<Integer> deleteElement(int position){
		list.remove(position+1);
		return list;
	}
	public int fetchElement(int index) {
		// TODO Auto-generated method stub
		return list.get(index+1);
	}
	public void print(){
		for(int i = 0;i < list.size(); i++)
			System.out.print(list.get(i)+" ");
		System.out.println();
	}
}
