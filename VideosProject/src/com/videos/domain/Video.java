package com.videos.domain;

import java.util.ArrayList;
import java.util.List;

public class Video {
	
	private String url;
	private String title;
	private List<String> tags;
	
	private User user;

	public Video(String url, String title, List<String> tags, User user) throws VideosException {
		
		if (url == null || url.trim().length()==0) {
			throw new VideosException(VideosException.EMPTY_URL);
		} else if (title == null || title.trim().length()==0) {
			throw new VideosException(VideosException.EMPTY_TITLE);
		} else if (tags == null || tags.isEmpty()) {
			throw new VideosException(VideosException.EMPTY_TAGS);
		} else if (user == null) {
			throw new VideosException(VideosException.NULL_USER);
		}
		
		for (String tag : tags) {
			if (tag == null || tag.trim().length()==0) {
				throw new VideosException(VideosException.EMPTY_TAG);
			}
		}
		
		this.url = url;
		this.title = title;
		this.tags =  new ArrayList<String>(tags);
		this.user = user;
		
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	
	public User getUser() {
		return user;
	}

	@Override
	public String toString() {
		return "Title = " + title + ", Url = " + url + ", Tags = " + tags;
	}
	
}
