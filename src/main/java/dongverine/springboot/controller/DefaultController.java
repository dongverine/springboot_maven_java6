package dongverine.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DefaultController {
	@RequestMapping("/getBoardList")
	@ResponseBody
	public List<String> getBoardList(Model model) {
		List list = new ArrayList<String>();
		list.add("aaaaa");
		//model.addAttribute("boardList",list);
		return list;
	}
}
