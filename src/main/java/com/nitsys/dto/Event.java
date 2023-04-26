package com.nitsys.dto;


public class Event {
	
	private long id;
	private String event;
	private String artist;
	
	public Event(long id, String event, String artist) {
		super();
		this.id = id;
		this.event = event;
		this.artist = artist;
	}
	
	public long getId() {
		return id;
	}

	public String getEvent() {
		return event;
	}

	public String getArtist() {
		return artist;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", event=" + event + ", artist=" + artist + "]";
	}

	

}
