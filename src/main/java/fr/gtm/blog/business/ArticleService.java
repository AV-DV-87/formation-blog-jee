package fr.gtm.blog.business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import fr.gtm.blog.domain.Article;

public class ArticleService extends CrudService {
	
	private static final List<Article> MOCK_ARTICLES = Collections
			.unmodifiableList(Arrays.asList(
					new Article[] { new Article(0, "Article n°1", "DESCR"),
							new Article(1, "Article n°2", "DESCR"),
							new Article(2, "Article n°3", "DESCR") }));

	private int idCount;
	private final List<Article> articles;
	
	

	public ArticleService(int idCount) {
		this.idCount = idCount;
		this.articles = new ArrayList<>();
		// FIXME: A supprimer lorsque l'accès BDD est implémenté.
		this.articles.addAll(ArticleService.MOCK_ARTICLES);
	}

	@Override
	public Article create(final String title, final String description) {
		final Article result = new Article();
//		result.setId(this.idCount++);
		result.setTitle(title);
		result.setDescription(description);
//		this.articles.add(result);
		//sauvegarde par la méthode du repo
		this.repo.save(result);
		return result;
	}

	@Override
	public List<Article> getList() {
		articles.addAll(this.repo.findAll());
		return articles;
	}
	
	/**
	 * Mise à jour d'un article existant en BDD.
	 * 
	 * @param article l'article à mettre à jour avec id rempli.
	 * @return Article l'article mis à jour depuis la BDD.
	 */
	@Override
	public Article edit(Article article) {
		if (article.getId() == null) {
			throw new IllegalArgumentException(
					"Cannot update an article without its id.");
		}
		return this.repo.save(article);
	}

	@Override
	public void delete(int id) {
		this.repo.deleteById(id);
//		for (Article a : this.articles) {
//			if (a.getId().equals(id)) {
//				toDelete = a;
//				break;
//			}
//		}
//		if (toDelete != null) {
//			this.r;
//		}
	}
}
