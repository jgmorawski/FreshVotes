package com.freshvotes.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


@Entity
public class Vote {

	private Boolean upvote;
	private VoteId pk;
	
	@EmbeddedId 
	public VoteId getPk() {
		return pk;
	}
	public void setPk(VoteId pk) {
		this.pk = pk;
	}
	public Boolean getUpvote() {
		return upvote;
	}
	public void setUpvote(Boolean upvote) {
		this.upvote = upvote;
	}
	
	
	
	
}
