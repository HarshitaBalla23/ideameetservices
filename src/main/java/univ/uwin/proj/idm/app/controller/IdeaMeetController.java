package univ.uwin.proj.idm.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import univ.uwin.proj.idm.app.services.IdeaMeetService;

@RestController
@RequestMapping("/idea")
public class IdeaMeetController {
	
	@Autowired
	private IdeaMeetService service;

	@CrossOrigin
	@GetMapping()
	public ResponseEntity<List<String>> getAllIdeas(){
		System.out.println("I am hithttp://localhost:8080/idea");
		return new ResponseEntity<List<String>>(service.getAllIdeas(), HttpStatus.OK);
	}
	
	@CrossOrigin
	@PostMapping("/store")
	public ResponseEntity<String> storeIdea( @RequestBody String ideaName ){
		return new ResponseEntity<String>(service.storeIdea(ideaName),HttpStatus.OK);
	}
	
}
