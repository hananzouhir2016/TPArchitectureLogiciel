package com.dispatch;

import java.util.Map;

import Elvator.Elevator;


public interface Idispatcher {
	
	public String getIdClosedFromFloor(int floor);
	public void init(Map<String, Elevator> elevatorsMap);

}
