package com.ElevatorFactory;

import Elvator.Elevator;

public abstract class ElevatorFactory {
	
	public abstract Elevator createElevator(int numberOfFloors,String identifier);

}
