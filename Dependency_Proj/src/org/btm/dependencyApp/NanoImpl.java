package org.btm.dependencyApp;
public class NanoImpl 
{
	public NanoImpl() 
	{
     System.out.println("Nano Implementaion object created");
	} 
	private int id;
	private String color;
	
	public void drive()
	{
    System.out.println("Nano Details below");
    System.out.println("Nano id ="+id);
    System.out.println("Nano Color ="+color);
    System.out.println("Driving Nano Boom!!!");
	}
}
