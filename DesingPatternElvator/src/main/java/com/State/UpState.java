package com.State;

import Elvator.Elevator;

public class UpState extends ElevatorStat {

	public UpState(Elevator elevator) {
		super(elevator);
	}

	@Override
	public int distanceFromFloor(int floor) {
		if(floor>=elevator.getCurrentFloor())
			return floor-elevator.getCurrentFloor();
		else 
			return floor + elevator.getNumberOfFloors() - elevator.getCurrentFloor();
	}

	@Override
	public void down() {
		throw new IllegalStateException("elevator is going up it can't switch direction ...");	
	}

	@Override
	public void up() {
	    throw new IllegalStateException("elevator already going up...");	
	}

	@Override
	public void rest() {
		elevator.setElevatorState(new RestState(elevator));
	}

	@Override
	public void stop() {
		elevator.setElevatorState(new StopState(elevator));

	}
}
