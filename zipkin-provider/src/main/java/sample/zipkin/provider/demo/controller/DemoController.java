package sample.zipkin.provider.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sample.zipkin.provider.demo.service.DemoService;

@RequestMapping(path = "/demo")
@RestController
public class DemoController {

	@Autowired
	private DemoService demoService;

	@RequestMapping(path = "/say")
	public String say(@RequestParam(value = "world") String world) {
		return demoService.say(world);
	}

}
