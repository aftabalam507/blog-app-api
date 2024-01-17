package com.blog.services;

import java.util.List;
import com.blog.entity.Post;
import com.blog.payloads.PostDto;

public interface PostService {

	// create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

	// update
	PostDto updatePost(PostDto postDto, Integer postId);

	// delete
	void deletePost(Integer postId);

	// get all post
	List<PostDto> getAllPost();

	// get single post
	PostDto getPostById(Integer postId);

	// get all post by category
	List<Post> getPostByCategory(Integer categoryId);

	// get all post by user
	List<Post> getPostsByUser(Integer userId);

	// search post
	List<Post> searchPost(String keyword);
}
