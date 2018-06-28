/**
 * 
 */
package fr.gtm.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.gtm.blog.domain.Author;

/**
 * @author Adminl
 *
 */
public interface AuthorRepository extends JpaRepository<Author, Integer> {
	
}
