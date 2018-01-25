package fr.potajaime.controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*")
public class Controller  {
	
	
	@RequestMapping(value="/hello" ,method=RequestMethod.GET , produces = "application/json")
	@ResponseBody
	public User hello() {
		System.out.println("Ionic client send us a request cool !");
		return new User("soufiane","soufiane");
	}

}
