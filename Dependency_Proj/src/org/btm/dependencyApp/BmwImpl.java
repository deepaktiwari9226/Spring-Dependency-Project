package org.btm.dependencyApp;
import java.util.*;
public class BmwImpl  implements Icars
{
	public BmwImpl() 
	{
	    System.out.println("Bmw implementation object created");
	}
	   private int id;  // primitive data type
	   private String color; // Class type
	   private Engine engine; // Class type
	   private List<String>wheels; // Collection type 
     public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public List<String> getWheels() {
		return wheels;
	}
	public void setWheels(List<String> wheels) {
		this.wheels = wheels;
	}
@Override
public void drive() {
	  System.out.println("BMW details below!!");
	  System.out.println("BMW Id = "+getId());
	  System.out.println("BMW Color = "+getColor());
	  System.out.println("BMW Engine = "+getEngine());
	  System.out.println("BMW Wheels = "+getWheels());
	  System.out.println("BMW Driven Vroom!!!!");
}
}
