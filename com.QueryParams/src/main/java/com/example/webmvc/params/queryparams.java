package com.example.webmvc.params;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class queryparams {
	@GetMapping(value="/welcome")
	public ResponseEntity<String> welcomeMsg(@RequestParam("name") String name,@RequestParam("cash") Double Cash){
		
		String responsePayLoad="Hello"+name+"Good morning take this amount Rs." +Cash;
		
		return new  ResponseEntity<String>(responsePayLoad,HttpStatus.OK);
		
		
	}

}
