package com.tcs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/hello")
public class HelloController {
	
	@RequestMapping(value = "/{name}.spring", method = RequestMethod.GET)
	public @ResponseBody String getHello(@PathVariable String name)
	{
		String result = "Hello " + name;
		return result;
	}
	
}
