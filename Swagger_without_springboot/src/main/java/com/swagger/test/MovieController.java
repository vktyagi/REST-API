package com.swagger.test;

import io.swagger.annotations.Api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value="getMovieName", description="Get movie name detail")
@RequestMapping("/movie")
public class MovieController {

	@RequestMapping(value="/{name}", method = RequestMethod.GET)
	public String getMovie(@PathVariable String name, ModelMap model) {
		model.addAttribute("movie", name);
		return "list";

	}
	
}