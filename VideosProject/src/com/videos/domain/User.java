package com.videos.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
	
	private String name;
	private String surname;
	private String password;
	private final Date registrationDate;
	
	private List<Video> videos;

	public User(String name, String surname, String password) throws VideosException {
		
		if (name == null || name.trim().length() == 0) {
			throw new VideosException(VideosException.EMPTY_NAME);
		} else if (surname == null || surname.trim().length()==0) {
			throw new VideosException(VideosException.EMPTY_SURNAME);
		} else if (password == null || password.trim().length()==0) {
			throw new VideosException(VideosException.EMPTY_PASSWORD);
		}
		
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.registrationDate = new Date();
		
		videos = new ArrayList<Video>();
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Date getRegistrationDate() {
		return registrationDate;
	}
	
	public void addVideo(String url, String title, List<String> tags) throws VideosException {
		videos.add(new Video(url, title, tags, this));
	}
	
	public List<Video> getVideos() {
		return new ArrayList<Video>(videos);
	}
	
}
