package com.besweety.wallpapers.picasa.model;

import java.io.Serializable;

public class Wallpaper implements Serializable {
	private static final long serialVersionUID = 1L;
	private String url, photoJson;
	private int width, height;
	private int position;

	public Wallpaper() {
	}

	public Wallpaper(String photoJson, String url, int width, int height,int position) {		
		this.photoJson = photoJson;
		this.url = url;
		this.width = width;
		this.height = height;
		this.position=position;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPhotoJson() {
		return photoJson;
	}

	public void setPhotoJson(String photoJson) {
		this.photoJson = photoJson;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
	
}
