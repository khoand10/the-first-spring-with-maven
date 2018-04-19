package single.khoand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TheFirstController {
	@RequestMapping("/")
	/*@ResponseBody*/
	public String loadIndex() {
		return "index.jsp";
	}
}
