package com.john.zookeeper;

public class Bat extends Mammal{

	public Bat() {
		super();
		this.energy = 300;
	}
	
	public void fly() {
		energy -= 50;
		System.out.println("The bat is airborne");
		displayEnergy();
	}
	
	public void eatHumans() {
		energy += 25;
		System.out.println("The bat is satisfied");
		displayEnergy();
	}
	
	public void attackTown() {
		energy -= 100;
		System.out.println("The bat is attacking a town");
		displayEnergy();
	}
	
	

}
