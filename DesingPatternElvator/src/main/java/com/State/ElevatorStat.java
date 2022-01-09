package com.State;

import Elvator.Elevator;

public abstract class ElevatorStat {
	
	protected Elevator elevator;
	
	public ElevatorStat(Elevator elevator) {
		super();
		this.elevator = elevator;
	}
	public abstract void down();
	public abstract void up();
	public abstract void rest();
	public abstract void stop();
	public abstract int distanceFromFloor(int floor);

}
