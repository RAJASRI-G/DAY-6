package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="MANGHWAWORLD")
public class StudentDemo {

	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="status")
	private String status;
	@Column(name="genre")
	private String genre;
	@Column(name="views")
	private int views;
	@Column(name="rating")
	private int rating;
	@Column(name="chapters")
	private int chapters;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getChapters() {
		return chapters;
	}
	public void setChapters(int chapters) {
		this.chapters = chapters;
	}
	
	public StudentDemo(int id, String name, String status, String genre, int views, int rating, int chapters) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.genre = genre;
		this.views = views;
		this.rating = rating;
		this.chapters = chapters;
	}
	public StudentDemo()
	{
		
	}
}
