package uk.ac.belfastmet.todo.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jdk.internal.org.jline.utils.Log;
import uk.ac.belfastmet.todo.service.ToDoService;

@Controller
@RequestMapping
public class ToDoController {

	Logger log = LoggerFactory.getLogger(ToDoController.class);

	/**
	 * 
	 * @param model
	 * @return
	 */

	@GetMapping("/")
	public String homePage(Model model) {

		ToDoService todoService = new ToDoService();
		model.addAttribute("tasks", todoService.gettaskToDo());

		String name = "Gerald";
		model.addAttribute("myName", name);
		//added a + name to the logger so that it prints out the name of the person in the console
		log.info("index page" + name);
		log.debug("there is a possible path error page one is not able to load");
		return "index";

	}

	/**
	 * 
	 * @param model
	 * @return
	 */

	@GetMapping("/Page2")
	public String page2Page(Model model) {

		ToDoService todoService = new ToDoService();
		model.addAttribute("tasks", todoService.gettaskToDo());

		String name = "Gerald";
		model.addAttribute("myName", name);
		//added a + name to the logger so that it prints out the name of the person in the console
		log.info("page 2" + name);
		log.debug("there is a possible path error page two is not able to load");
		return "page2";

	}

	/**
	 * 
	 * @param model
	 * @return
	 */

	@GetMapping("/Page3")
	public String page3Page(Model model) {

		ToDoService todoService = new ToDoService();
		model.addAttribute("tasks", todoService.gettaskToDo());

		String name = "Gerald";
		model.addAttribute("myName", name);
		//added a + name to the logger so that it prints out the name of the person in the console
		log.info("page 3" + name);
		log.debug("there is a possible path error page three is not able to load" + name);

		return "page3";

	}

}
