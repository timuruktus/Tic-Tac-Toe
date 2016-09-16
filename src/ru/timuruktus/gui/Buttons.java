package ru.timuruktus.gui;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JButton;

public class Buttons  {
	private JButton b0,b1,b2,b3,b4,b5,b6,b7,b8;
	Map<Integer, JButton> hashmap;
	
	
	
	public Buttons(){
		hashmap = new HashMap<Integer, JButton>();
		hashmap.put(0,b0);
		hashmap.put(1,b1);
		hashmap.put(2,b2);
		hashmap.put(3,b3);
		hashmap.put(4,b4);
		hashmap.put(5,b5);
		hashmap.put(6,b6);
		hashmap.put(7,b7);
		hashmap.put(8,b8);
	}
	
	
	public int returnButId (JButton ourBut){
		 for(Entry<Integer, JButton> entry: hashmap.entrySet()) {
		  if (entry.getValue().equals(ourBut)) return (int) entry.getKey();
		 }
		return 0;
		}
	
	public JButton returnBut(int number){
		return hashmap.get(number);
	}
	
}
