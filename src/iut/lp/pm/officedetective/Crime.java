package iut.lp.pm.officedetective;

import java.util.Date;
import java.util.UUID;

public class Crime {
	
	public Crime(String titre) {
		super();
		this.titre = titre;
	}
	
	public Crime(String titre, Date dateCrime, Boolean resolu) {
		super();
		this.titre = titre;
		this.dateCrime = dateCrime;
		this.resolu = resolu;
	}

	private String titre;
	private UUID id = UUID.randomUUID();
	private Date dateCrime; 
	private Boolean resolu;
	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}
	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}
	/**
	 * @return the id
	 */
	public UUID getId() {
		return id;
	}
	/**
	 * @return the dateCrime
	 */
	public Date getDateCrime() {
		return dateCrime;
	}
	/**
	 * @param dateCrime the dateCrime to set
	 */
	public void setDateCrime(Date dateCrime) {
		this.dateCrime = dateCrime;
	}
	/**
	 * @return the resolu
	 */
	public Boolean getResolu() {
		return resolu;
	}
	/**
	 * @param resolu the resolu to set
	 */
	public void setResolu(Boolean resolu) {
		this.resolu = resolu;
	}
}
