package com.mybackend.dslist.dto;

import com.mybackend.dslist.entities.Game;
import com.mybackend.dslist.projections.GameMinProjection;

public class GameMinDTO {

	private Long id;	
	private Integer year;
	private String shortDescription;
	private String title;
	private String imgUrl;
	
	public GameMinDTO() {

	}

	public GameMinDTO(Game entity) {
		id = entity.getId();
		year = entity.getYear();
		shortDescription = entity.getShortDescription();
		title = entity.getTitle();
		imgUrl = entity.getImgUrl();
	}
	
	public GameMinDTO(GameMinProjection projection) {
		id = projection.getId();
		year = projection.getYear();
		shortDescription = projection.getShortDescription();
		title = projection.getTitle();
		imgUrl = projection.getImgUrl();
	}

	public Long getId() {
		return id;
	}

	public Integer getYear() {
		return year;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public String getTitle() {
		return title;
	}

	public String getImgUrl() {
		return imgUrl;
	}
}
