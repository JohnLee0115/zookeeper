package com.john.zookeeper;

public class Gorilla extends Mammal{

	public Gorilla() {
		super();
	}
	
	public void throwSomething() {
		energy -= 5;
		System.out.println("The gorilla has thrown something");
		displayEnergy();
	}
	
	public void eatBananas() {
		energy += 10;
		System.out.println("Gorilla is satisfied");
		displayEnergy();
	}
	
	public void climb() {
		energy -= 10;
		System.out.println("The gorilla has climbed a tree");
		displayEnergy();
	}

}
