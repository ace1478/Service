package dakt.javatech.jhibernate.entity;

import java.util.Set;

import org.codehaus.jackson.annotate.JsonBackReference;

public class Level implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer levelid;
	private String levelname;
	@JsonBackReference
	private Set<Grammarguideline> lstGramGuideLine;
	@JsonBackReference
	private Set<Vocabularyguideline> lstVocabGuideLine;
	@JsonBackReference
	private Set<Readexercise> lstReadExercise;
	@JsonBackReference
	private Set<Listenexercise> lstListenExercise;
	@JsonBackReference
	private Set<ListenGuideline> lstListenGuideline;
	@JsonBackReference
	public Set<ListenGuideline> getLstListenGuideline() {
		return lstListenGuideline;
	}
	@JsonBackReference
	public void setLstListenGuideline(Set<ListenGuideline> lstListenGuideline) {
		this.lstListenGuideline = lstListenGuideline;
	}
	@JsonBackReference
	public Set<Listenexercise> getLstListenExercise() {
		return lstListenExercise;
	}
	@JsonBackReference
	public void setLstListenExercise(Set<Listenexercise> lstListenExercise) {
		this.lstListenExercise = lstListenExercise;
	}
	@JsonBackReference
	public Set<Readexercise> getLstReadExercise() {
		return lstReadExercise;
	}
	@JsonBackReference
	public void setLstReadExercise(Set<Readexercise> lstReadExercise) {
		this.lstReadExercise = lstReadExercise;
	}
	@JsonBackReference
	public Set<Vocabularyguideline> getLstVocabGuideLine() {
		return lstVocabGuideLine;
	}
	@JsonBackReference
	public void setLstVocabGuideLine(Set<Vocabularyguideline> lstVocabGuideLine) {
		this.lstVocabGuideLine = lstVocabGuideLine;
	}
	@JsonBackReference
	public Set<Grammarguideline> getLstGramGuideLine() {
		return lstGramGuideLine;
	}
	@JsonBackReference
	public void setLstGramGuideLine(Set<Grammarguideline> lstGramGuideLine) {
		this.lstGramGuideLine = lstGramGuideLine;
	}
	public Integer getLevelid() {
		return levelid;
	}
	public void setLevelid(Integer levelid) {
		this.levelid = levelid;
	}
	public String getLevelname() {
		return levelname;
	}
	public void setLevelname(String levelname) {
		this.levelname = levelname;
	}


}
