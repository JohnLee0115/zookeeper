package com.john.zookeeper;

public class Mammal {
	protected int energy;

	public Mammal() {
		this.energy = 100;
	}
	
	protected void displayEnergy() {
		System.out.println("Energy level: " + this.energy);
	}

}
