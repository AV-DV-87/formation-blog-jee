package fr.gtm.blog.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import fr.gtm.blog.domain.Article;


public abstract class CrudService<ENTITY> {

	@Autowired
	protected JpaRepository<ENTITY, Integer> repo;

	public CrudService() {
		super();
	}


	public abstract void delete(int id);

	public abstract Article edit(ENTITY entity);

	public abstract List<Article> getList();

	public abstract Article create(final String title, final String description);

	/**
	 * Fonction permettant de factoriser les appels à repo.save(..).
	 * 
	 * @param article l'article à persister pour création ou mise à jour.
	 * @return Article l'article modifié et validé par la BDD.
	 */
	private ENTITY save(ENTITY entity) {
		return this.repo.save(entity);
	}
	
	

}