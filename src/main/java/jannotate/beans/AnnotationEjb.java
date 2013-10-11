package jannotate.beans;

import jannotate.domain.Annotation;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class AnnotationEjb {

	@PersistenceContext
	EntityManager em;
	
	@TransactionAttribute()
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
