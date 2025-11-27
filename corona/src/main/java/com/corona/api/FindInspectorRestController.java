package com.corona.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindInspectorRestController {
	
	@Autowired
	private Environment env;

	@GetMapping("/{district}/inspector")
	public String getInspector(@PathVariable("district") String district) throws FileNotFoundException, IOException {

		Properties props = new Properties();
                System.out.println(env.getProperty("config-file"));
		props.load(new FileInputStream(new File("/config/district-inspector.properties")));

		return props.getProperty(district);

	}

}
