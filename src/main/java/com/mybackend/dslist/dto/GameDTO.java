package com.mybackend.dslist.dto;

import java.util.Objects;

import com.mybackend.dslist.entities.Game;

public class GameDTO {

	private Long id;
	private Integer year;
	private String longDescription;
	private String shortDescription;
	private String title;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	
	public GameDTO() {

	}

	public GameDTO(Game entity) {
		this.id = entity.getId();
		this.year = entity.getYear();
		this.longDescription = entity.getLongDescription();
		this.shortDescription = entity.getShortDescription();
		this.title = entity.getTitle();
		this.genre = entity.getGenre();
		this.platforms = entity.getPlatforms();
		this.score = entity.getScore();
		this.imgUrl = entity.getImgUrl();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatforms() {
		return platforms;
	}

	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameDTO other = (GameDTO) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
