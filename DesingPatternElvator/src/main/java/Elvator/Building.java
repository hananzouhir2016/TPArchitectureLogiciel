package Elvator;

import java.util.HashMap;
import java.util.Map;

import com.ElevatorFactory.ConcrteteElevatorFactory;
import com.ElevatorFactory.ElevatorFactory;
import com.dispatch.Dispatcher;
import com.dispatch.Idispatcher;



public class Building {
	
	private Map<String , Elevator> elevators;
	
	private ElevatorFactory elevatorFactory = ConcrteteElevatorFactory.getInstance();
	
	private Idispatcher dispatcher=Dispatcher.getInstance();
	
	private int numberOfFloors;
	
	
	public Building(int numberOfFloors, String... elevators) {
		this.numberOfFloors = numberOfFloors;
        this.elevators = new HashMap<>();
     
        for (String elevator : elevators) {   	
        	Elevator e = elevatorFactory.createElevator(numberOfFloors, elevator);
            this.elevators.put(e.getId(), e);
        }
        dispatcher.init(this.elevators);
     }	
	public String requestElevator()
	{  	
		return dispatcher.getIdClosedFromFloor(numberOfFloors);
	}

	public String requestElevator(int floor)
	{
		return dispatcher.getIdClosedFromFloor(floor);
	}
	
	public void move(String elevatorId,String d){
		Elevator elevator = elevators.get(elevatorId);
		switch (d) {
        case "UP":
            elevator.getElevatorState().up();
            break;
        case  "DOWN":
            elevator.getElevatorState().down();
            break;
        default :
            throw new IllegalArgumentException("An elevator can move only UP or Down.");
    }
}

		public void stopAt(String elevatorId, int floor){
			Elevator elevator = elevators.get(elevatorId);
			elevator.setCurrentFloor(floor);
			elevator.getElevatorState().stop();
		}
		
	public Map<String, Elevator> getElevators() {
		return elevators;
	}

	public void setElevators(Map<String, Elevator> elevators) {
		this.elevators = elevators;
	}
	
}
