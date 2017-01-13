package com.springsecurity.Controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {

	
	@RequestMapping("/list")
	public String list(){
		return"Showing list...";
	}
	
	@Secured("ROLE_USER")
	@RequestMapping("/drafts")
	public String viewDraft(){
		return"Showing draft...";
	}
	
	@Secured({"ROLE_ADMIN","ROLE_USER"})
	@RequestMapping("/add")
	public String addPost(){
		return "Showing add....";
	}
}
