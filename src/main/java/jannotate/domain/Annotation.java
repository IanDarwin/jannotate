package jannotate.domain;

import java.lang.annotation.RetentionPolicy;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Annotation {
	@Id
	int id;
	String api;
	String name;
	RetentionPolicy retention;
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
	
	@Enumerated(EnumType.ORDINAL)
	public RetentionPolicy getRetention() {
		return retention;
	}
	public void setRetention(RetentionPolicy retention) {
		this.retention = retention;
	}
	public String getUse() {
		return use;
	}
	public void setUse(String use) {
		this.use = use;
	}
}
