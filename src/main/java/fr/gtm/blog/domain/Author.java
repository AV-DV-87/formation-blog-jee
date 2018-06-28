package fr.gtm.blog.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Author implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String name;
	
	private LocalDate subDate;
	
	private Address adress;
	
	private List<Article> articles;
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getSubDate() {
		return subDate;
	}
	public void setSubDate(LocalDate subDate) {
		this.subDate = subDate;
	}
	/**
	 * @return the adress
	 */
	public Address getAdress() {
		return adress;
	}
	/**
	 * @param adress the adress to set
	 */
	public void setAdress(Address adress) {
		this.adress = adress;
	}
	/**
	 * @return the articles
	 */
	public List<Article> getArticles() {
		return articles;
	}
	/**
	 * @param articles the articles to set
	 */
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	
}
