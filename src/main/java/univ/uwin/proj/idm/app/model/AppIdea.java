package univ.uwin.proj.idm.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="APP_IDEA")
public class AppIdea {

	@Id
	@GeneratedValue
	private Long id;
	private String ideaName;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIdeaName() {
		return ideaName;
	}
	public void setIdeaName(String ideaName) {
		this.ideaName = ideaName;
	}
	
	
}
