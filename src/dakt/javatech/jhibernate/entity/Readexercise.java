package dakt.javatech.jhibernate.entity;
// Generated Sep 26, 2018 6:04:22 AM by Hibernate Tools 5.3.1.Final

import java.util.HashSet;
import java.util.Set;

import org.codehaus.jackson.annotate.JsonBackReference;

/**
 * Readexercise generated by hbm2java
 */
public class Readexercise implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer readexeriseid;
	private String readname;
	private String readimage;
	private Integer checkcauhoi;
	@JsonBackReference
	private Set<Readquestion> readquestions;
	private Level level;

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public Readexercise() {
	}

	public Readexercise(String readname, String readimage, Integer checkcauhoi, Set readquestions) {
		this.readname = readname;
		this.readimage = readimage;
		this.checkcauhoi = checkcauhoi;
		this.readquestions = readquestions;
	}

	public Integer getReadexeriseid() {
		return this.readexeriseid;
	}

	public void setReadexeriseid(Integer readexeriseid) {
		this.readexeriseid = readexeriseid;
	}

	public String getReadname() {
		return this.readname;
	}

	public void setReadname(String readname) {
		this.readname = readname;
	}

	public String getReadimage() {
		return this.readimage;
	}

	public void setReadimage(String readimage) {
		this.readimage = readimage;
	}

	public Integer getCheckcauhoi() {
		return this.checkcauhoi;
	}

	public void setCheckcauhoi(Integer checkcauhoi) {
		this.checkcauhoi = checkcauhoi;
	}

	public Set getReadquestions() {
		return this.readquestions;
	}

	public void setReadquestions(Set readquestions) {
		this.readquestions = readquestions;
	}

}
