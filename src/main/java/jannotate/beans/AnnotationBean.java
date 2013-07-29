package jannotate.beans;

import jannotate.domain.Annotation;
import javax.enterprise.inject.Produces;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class AnnotationBean {

	@Resource
	EntityManager em;
	
	List<Annotation> getAnnotations() {
		return (List<Annotation>) em.createQuery(
			"SELECT a FROM Annotation a order by a.api, a.name").getResultList();
	}
	
	@Inject
	Annotation annotation;
	
	@Produces
	public Annotation getAnnotation() {
		if (annotation == null) {
			annotation = new Annotation();
		}
		return annotation;
	}
	
	String addEntry() {
		em.persist(annotation);
		return "index";
	}
}
