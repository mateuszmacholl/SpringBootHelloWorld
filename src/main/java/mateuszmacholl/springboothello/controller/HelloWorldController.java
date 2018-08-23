package mateuszmacholl.springboothello.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class HelloWorldController {

	@RequestMapping(value = "")
	public ResponseEntity helloWorld(){
		return new ResponseEntity<>("hello world", HttpStatus.OK);
	}
}
