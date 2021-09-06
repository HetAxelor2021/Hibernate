package com.orphanRemovalEx;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="Post")
@Table(name="post")
public class Post {
	@Id
	@GeneratedValue
	private Long id;
	
	private String title;
	
	@OneToMany(mappedBy = "post",cascade=CascadeType.ALL,orphanRemoval=true)
	private List<PostComment> comments = new ArrayList<>();
	
	public Post addComment(PostComment comment) {
		comments.add(comment);
		comment.setPost(this);
		return this;
	}
	public Post removeComment(PostComment comment) {
		comments.remove(comment);
		comment.setPost(null);
		return this;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<PostComment> getComments() {
		return comments;
	}
	public void setComments(List<PostComment> comments) {
		this.comments = comments;
	}


}
