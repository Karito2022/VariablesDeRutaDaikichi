package com.karitoreyes.project.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class ControllerRutaDaikichi {
    @RequestMapping("")
    public String daikichi() {
            return "¡Welcome!";
    }
    @RequestMapping("/today")
    public String today() {
            return "¡Today you will find luck in all your endeavors!";
    }
    @RequestMapping("/tomorrow")
    public String tomorrow() {
            return "¡Tomorrow,an opportunity will arise, so be sure to be open to new ideas!";
    }
    
    @RequestMapping("/travel/{lugar}")
    public String travel(@PathVariable("lugar") String lugar){
    	return "¡Congratulations! ¡You will soon travel to " + lugar + "!";
    } 
    
    @RequestMapping("/lotto/{numero}")
    public String lotto(@PathVariable("numero") String numero){
    	int numeroInt = Integer.parseInt(numero);
    	if(numeroInt % 2 == 0) {
    		return "You will take a grand journey in the near future,but we wary of tempting offers";
    	}else {
    		return "You have enjoyed the fruits of your job but now is a great time to spend with family and friends";
    	}	
    } 
}