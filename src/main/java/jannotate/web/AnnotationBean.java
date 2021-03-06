package jannotate.web;

import jannotate.beans.AnnotationEjb;
import jannotate.domain.Annotation;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class AnnotationBean {

	@ManagedProperty("#{annotation}")
	Annotation instance;
	
	public Annotation getInstance() {
		return instance;
	}

	public void setInstance(Annotation instance) {
		this.instance = instance;
	}

	@EJB
	AnnotationEjb bean;
	
	public List<Annotation> getAnnotations() {
		return bean.getAnnotations();
	}
	
	
	public String addEntry() {
		System.out.println("AnnotationBean.addEntry()");
		bean.addEntry(instance);
		return "index";
	}
}
