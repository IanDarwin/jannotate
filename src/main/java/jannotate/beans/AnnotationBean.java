package jannotate.beans;

import jannotate.domain.Annotation;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.inject.Named;

@Named
public class AnnotationBean {

	@Resource
	EntityManager em;
	
	List<Annotation> getAnnotations() {
		return (List<Annotation>) em.createQuery("from Annotation").getResultList();
	}
}
