package com.bitacademy.jblog.vo;

public class BlogVo {
	private String title;
	private String profile;
	private String id;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "BlogVo [title=" + title + ", profile=" + profile + ", id=" + id + "]";
	}

}
