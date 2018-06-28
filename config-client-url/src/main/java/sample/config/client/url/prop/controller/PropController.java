package sample.config.client.url.prop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sample.config.client.url.prop.service.PropService;

@RequestMapping(path = "/prop")
@RestController
public class PropController {

	@Autowired
	private PropService propService;

	@RequestMapping(path = "/call")
	public String call() {
		return propService.call();
	}

}
