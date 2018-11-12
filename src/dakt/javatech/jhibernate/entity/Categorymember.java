package dakt.javatech.jhibernate.entity;
// Generated Sep 26, 2018 6:04:22 AM by Hibernate Tools 5.3.1.Final

import java.util.HashSet;
import java.util.Set;

import org.codehaus.jackson.annotate.JsonBackReference;

/**
 * Categorymember generated by hbm2java
 */
public class Categorymember implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int categorymemberid;
	private String categorymembername;
	@JsonBackReference
	private Set<Member> lstMember;
	@JsonBackReference
	public Set<Member> getLstMember() {
		return lstMember;
	}

	public void setLstMember(Set<Member> lstMember) {
		this.lstMember = lstMember;
	}

	public Categorymember() {
	}

	public Categorymember(int categorymemberid) {
		this.categorymemberid = categorymemberid;
	}
//
//	public Categorymember(int categorymemberid, String categorymembername, Set members) {
//		this.categorymemberid = categorymemberid;
//		this.categorymembername = categorymembername;
//		this.members = members;
//	}

	public int getCategorymemberid() {
		return this.categorymemberid;
	}

	public void setCategorymemberid(int categorymemberid) {
		this.categorymemberid = categorymemberid;
	}

	public String getCategorymembername() {
		return this.categorymembername;
	}

	public void setCategorymembername(String categorymembername) {
		this.categorymembername = categorymembername;
	}

}