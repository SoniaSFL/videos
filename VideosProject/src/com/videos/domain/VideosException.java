package com.videos.domain;

public class VideosException extends Exception {
	
	// default serial number
	private static final long serialVersionUID = 1L;
	
	public static final String EMPTY_URL = "ERROR: URL field can't be empty";
	
	public static final String EMPTY_TITLE = "ERROR: Title field can't be empty";
	
	public static final String EMPTY_TAGS = "ERROR: Tags list can't be empty";
	
	public static final String EMPTY_TAG = "ERROR: Tag can't be empty";
	
	public static final String NULL_USER = "ERROR: User can't be null";
	
	public static final String EMPTY_NAME = "ERROR: Name field can't be empty";
	
	public static final String EMPTY_SURNAME = "ERROR: Surname field can't be empty";
	
	public static final String EMPTY_PASSWORD = "ERROR: Password field can't be empty";
	
	public VideosException(String message) {
		super(message);
	}

}
