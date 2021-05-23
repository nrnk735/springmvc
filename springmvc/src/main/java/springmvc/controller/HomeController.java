package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	
	@RequestMapping(path="/home",method=RequestMethod.GET)
	public String home(Model model)
	{
		System.out.println("this is my home url");
		model.addAttribute("name","Nishant");
		model.addAttribute("id",12345);
		
		List<String>friends=new ArrayList<String>();
		friends.add("Roshni");
		friends.add("Lily");
		friends.add("Swati");
		
		model.addAttribute("f",friends);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("this is about controller");
		return "about";
		
	}
	
	//services
	//help
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("this is help page");
		//Creating ModelAndView object
		ModelAndView modelAndView=new ModelAndView();
		
		//setting the data
		modelAndView.addObject("name","Niharika");
		modelAndView.addObject("rollnumber",1234);
		LocalDateTime now=LocalDateTime.now();
		modelAndView.addObject("time",now);
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(112);
		list.add(89);
		list.add(90);
		list.add(80);
		
		modelAndView.addObject("marks",list);
		
		//setting the view name
		modelAndView.setViewName("help");
		
		return modelAndView;
	}

}
