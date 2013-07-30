package jannotate.domain;

import java.lang.annotation.RetentionPolicy;
import javax.validation.constraints.NotNull;

import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity @ManagedBean
public class Annotation {
	int id;
	String api;
	String name;
	RetentionPolicy retention = RetentionPolicy.RUNTIME;
	String usage;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@NotNull
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
	
	@Column(name="retention_policy")@Enumerated(EnumType.ORDINAL)
	public RetentionPolicy getRetention() {
		return retention;
	}
	public void setRetention(RetentionPolicy retention) {
		this.retention = retention;
	}
	public String getUsage() {
		return usage;
	}
	public void setUsage(String use) {
		this.usage = use;
	}
}
