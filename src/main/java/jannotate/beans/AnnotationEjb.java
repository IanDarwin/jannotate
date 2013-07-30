package jannotate.beans;

import jannotate.domain.Annotation;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Transient;
import javax.ejb.*;

@Stateless
public class AnnotationEjb {

	@PersistenceContext
	EntityManager em;
	
	public List<Annotation> getAnnotations() {
		return (List<Annotation>) em.createQuery(
			"SELECT a FROM Annotation a order by a.api, a.name").getResultList();
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public String addEntry(Annotation instance) {
		System.out.println("AnnotationEjb.addEntry():" + instance);
		em.persist(instance);
		return "index";
	}
}
