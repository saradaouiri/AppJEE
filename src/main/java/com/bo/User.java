package com.bo;

public class User {
	private String nom ;
	private String prenom ;
	private String login ;
	private String password ;
	private int bestScore ;
	private String deLancee ;
	
	private int[] tab= new int[3];
	
	
	public String getNom() {
		return nom;
	}
	public String getDeLancee() {
		return deLancee;
	}
	public int[] getTab() {
		return tab ;
	}
	public void setTab(int[] tab) {
		this.tab = tab;
	}
	public void setDeLancee(String deLancee) {
		this.deLancee = deLancee;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password ;
	}
	public int getBestScore() {
		return bestScore;
	}
	public void setBestScore(int bestScore) {
		this.bestScore = bestScore;
	}

}
