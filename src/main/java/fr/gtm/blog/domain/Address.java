package fr.gtm.blog.domain;

import java.io.Serializable;

public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer id;
	
	private String city;
	
	private String codepostal;
	
	private String line;
	
	//Lien avec auteur : private Author adress pas obligatoire = BESOINS METIERS? recherche par adresse?
	
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
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the codepostal
	 */
	public String getCodepostal() {
		return codepostal;
	}

	/**
	 * @param codepostal the codepostal to set
	 */
	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}

	/**
	 * @return the line
	 */
	public String getLine() {
		return line;
	}

	/**
	 * @param line the line to set
	 */
	public void setLine(String line) {
		this.line = line;
	}
	
	
	
	
}
