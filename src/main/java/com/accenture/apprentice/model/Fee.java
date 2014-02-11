package com.accenture.apprentice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the fee database table.
 * 
 */
@Entity
public class Fee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="fee_id")
	private int feeId;

	@Lob
	@Column(name="fee_desc")
	private String feeDesc;

	@Column(name="fee_name")
	private String feeName;

	@Column(name="lab_fee")
	private double labFee;

	@Column(name="lec_fee")
	private double lecFee;

	//bi-directional many-to-one association to Subject
	@OneToMany(mappedBy="fee")
	private List<Subject> subjects;

	public Fee() {
	}

	public int getFeeId() {
		return this.feeId;
	}

	public void setFeeId(int feeId) {
		this.feeId = feeId;
	}

	public String getFeeDesc() {
		return this.feeDesc;
	}

	public void setFeeDesc(String feeDesc) {
		this.feeDesc = feeDesc;
	}

	public String getFeeName() {
		return this.feeName;
	}

	public void setFeeName(String feeName) {
		this.feeName = feeName;
	}

	public double getLabFee() {
		return this.labFee;
	}

	public void setLabFee(double labFee) {
		this.labFee = labFee;
	}

	public double getLecFee() {
		return this.lecFee;
	}

	public void setLecFee(double lecFee) {
		this.lecFee = lecFee;
	}

	public List<Subject> getSubjects() {
		return this.subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

}