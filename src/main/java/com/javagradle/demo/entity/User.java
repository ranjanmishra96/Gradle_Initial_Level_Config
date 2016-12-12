package com.javagradle.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="m1_user")
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="users_id_seq")
	@SequenceGenerator(name="users_id_seq", sequenceName="users_id_seq", allocationSize=1)
    @Column(name = "u_id")
	private long uid;
	
	@Column(name="ue_id")
	private long ueid;
	@Column(name="u_name")
	private String uname;
	@Column(name="u_createdon")
	private Date ucreatedon;
	@Column(name="u_status")
	private String ustatus;
	
	
	
	
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public long getueid() {
		return ueid;
	}
	public void setueid(long ueid) {
		this.ueid = ueid;
	}
	public String getuname() {
		return uname;
	}
	public void setuname(String uname) {
		this.uname = uname;
	}
	public Date getucreatedon() {
		return ucreatedon;
	}
	public void setucreatedon(Date ucreatedon) {
		this.ucreatedon = ucreatedon;
	}
	public String getustatus() {
		return ustatus;
	}
	public void setustatus(String ustatus) {
		this.ustatus = ustatus;
	}
	
}
