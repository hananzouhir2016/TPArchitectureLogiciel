package com.dispatch;

import java.util.Map;

import Elvator.Elevator;


public class Dispatcher implements Idispatcher{
	
	private Map<String,Elevator> elevators;
	
	public static Dispatcher _instance=null;
	private Dispatcher(){}
	public static Dispatcher getInstance(){
		if(_instance==null)
			return new Dispatcher();
		return _instance;
	}

	

	public String getIdClosedFromFloor(int floor){
        int distMin = 10;
        String idClosed=null;
		for(String id : elevators.keySet())
		{	
			if (      /* elevator is not in stop state */
					elevators.get(id).getElevatorState().distanceFromFloor(floor) != -1 && 
					elevators.get(id).getElevatorState().distanceFromFloor(floor) <= distMin)
			{
			  distMin = elevators.get(id).getElevatorState().distanceFromFloor(floor);
			  idClosed = id;
			}
		}	
		return idClosed;
	}

	public Map<String, Elevator> getElevators() {
		return elevators;
	}

	public void setElevators(Map<String, Elevator> elevators) {
		this.elevators = elevators;
	}
	public void init(Map<String, Elevator> elevatorsMap) {
		// TODO Auto-generated method stub
		this.elevators = elevatorsMap;
	}

}
