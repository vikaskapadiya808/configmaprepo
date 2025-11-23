package com.corona.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corona.dto.Guidelines;

@RestController
public class CoronaGuidelinesRestController {

	@Autowired
	private Environment env;

	@GetMapping(value = "/guidelines", produces = MediaType.APPLICATION_JSON_VALUE)
	public Guidelines guidelines() {
		Guidelines guidelines = new Guidelines(env.getProperty("guidelines.oxygenLevels"),
				env.getProperty("guidelines.quarantine"), env.getProperty("guidelines.liters"),
				env.getProperty("guidelines.temparatureLevels"));

		return guidelines;

	}

}
