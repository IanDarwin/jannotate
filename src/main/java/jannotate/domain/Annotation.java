package jannotate.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Annotation {
	@Id
	int id;
	String name;
	String api;
	String use;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getApi() {
		return api;
	}
	public void setApi(String api) {
		this.api = api;
	}
	public String getUse() {
		return use;
	}
	public void setUse(String use) {
		this.use = use;
	}
}
