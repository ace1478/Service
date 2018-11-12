package dakt.javatech.jhibernate.entity;
// Generated Sep 26, 2018 6:04:22 AM by Hibernate Tools 5.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Province generated by hbm2java
 */
public class Province implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int provinceId;
	private String provinceName;
	private Set<Student> students;

	public Province() {
	}

	public Province(int provinceId) {
		this.provinceId = provinceId;
	}

	public Province(int provinceId, String provinceName, Set students) {
		this.provinceId = provinceId;
		this.provinceName = provinceName;
		this.students = students;
	}

	public int getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}

	public String getProvinceName() {
		return this.provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public Set getStudents() {
		return this.students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

}