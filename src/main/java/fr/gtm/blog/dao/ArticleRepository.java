package fr.gtm.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.gtm.blog.domain.Article;

//interface qui hérite de JPA repository
public interface ArticleRepository extends JpaRepository<Article, Integer>{
	
}
