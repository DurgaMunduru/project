package com.dxc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="noteapp")
public class NoteThis {

	@Id
	private String noteid;
	private String notetitle;
	private String notecontent;
	private String notestatus;
	private String notecreatedat;
	private String notecreatedby;
	public NoteThis() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NoteThis(String noteid, String notetitle, String notecontent, String notestatus, String notecreatedat,
			String notecreatedby) {
		super();
		this.noteid = noteid;
		this.notetitle = notetitle;
		this.notecontent = notecontent;
		this.notestatus = notestatus;
		this.notecreatedat = notecreatedat;
		this.notecreatedby = notecreatedby;
	}
	public String getNoteid() {
		return noteid;
	}
	public void setNoteid(String noteid) {
		this.noteid = noteid;
	}
	public String getNotetitle() {
		return notetitle;
	}
	public void setNotetitle(String notetitle) {
		this.notetitle = notetitle;
	}
	public String getNotecontent() {
		return notecontent;
	}
	public void setNotecontent(String notecontent) {
		this.notecontent = notecontent;
	}
	public String getNotestatus() {
		return notestatus;
	}
	public void setNotestatus(String notestatus) {
		this.notestatus = notestatus;
	}
	public String getNotecreatedat() {
		return notecreatedat;
	}
	public void setNotecreatedat(String notecreatedat) {
		this.notecreatedat = notecreatedat;
	}
	public String getNotecreatedby() {
		return notecreatedby;
	}
	public void setNotecreatedby(String notecreatedby) {
		this.notecreatedby = notecreatedby;
	}
	@Override
	public String toString() {
		return "NoteThis [noteid=" + noteid + ", notetitle=" + notetitle + ", notecontent=" + notecontent
				+ ", notestatus=" + notestatus + ", notecreatedat=" + notecreatedat + ", notecreatedby=" + notecreatedby
				+ "]";
	}
	
	
	
}
