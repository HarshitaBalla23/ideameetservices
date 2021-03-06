package univ.uwin.proj.idm.app.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import univ.uwin.proj.idm.app.model.AppIdea;
import univ.uwin.proj.idm.app.repository.AppIdeaRepository;

@Service
public class IdeaMeetService {
	
	@Autowired
	private AppIdeaRepository repository;
	
	public String storeIdea(String ideaName) {
		String status = "failure";
		AppIdea idea= new AppIdea();
		idea.setIdeaName(ideaName);
		if(repository.save(idea).getId()>0) {
			status =  "sucess";
		}
		return status;
	}
	
	
	public List<String> getAllIdeas(){
		List<AppIdea> listOfIdeas = repository.findAll();
		return listOfIdeas.stream().map(a-> a.getIdeaName()).collect(Collectors.toList());
	}

}
