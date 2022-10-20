package com.vehicle.CRUD;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleControllerVehicle {
@Autowired

private CarRepo cr;
@GetMapping ("/car")
public List<CarEntity> getcar(){
	return cr.getjoin();
}

private TruckRepo tr;
@GetMapping ("/truck")
public List<TruckEntity> gettruck(){
	return tr.getjoin1();
}
}
