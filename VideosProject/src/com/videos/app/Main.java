package com.videos.app;

import java.util.Arrays;

import com.videos.domain.User;
import com.videos.domain.Video;

public class Main {

	public static void main(String[] args) {
		
		try {
			User user1 = new User("Juan", "Lopez", "juanlopez");
			User user2 = new User("Marta", "Santos", "martasantos");
			user1.addVideo("www.video1.com", "Video1", Arrays.asList("viajes"));
			user1.addVideo("www.video2.com", "Video2", Arrays.asList("paisaje", "naturaleza"));
			user2.addVideo("www.video1.com", "Video1", Arrays.asList("musica", "fiesta", "discoteca"));
			
			System.out.println(user1.getName() + " " + user1.getSurname() + " videos:");
			for (Video video : user1.getVideos()) {
				System.out.println(video.toString());
			}
			
			System.out.println(user2.getName() + " " + user2.getSurname() + " videos:");
			for (Video video : user2.getVideos()) {
				System.out.println(video.toString());
			}
			User user3 = new User("Juan", "Lopez", "");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
