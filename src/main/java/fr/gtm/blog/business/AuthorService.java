/**
 * 
 */
package fr.gtm.blog.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import fr.gtm.blog.dao.AuthorRepository;
import fr.gtm.blog.domain.Article;
import fr.gtm.blog.domain.Author;

/**
 * @author Adminl
 *
 */
public class AuthorService extends CrudService<Author> {
	@Autowired
	private AuthorRepository repo;

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Article edit(Author entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Article> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Article create(String title, String description) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
