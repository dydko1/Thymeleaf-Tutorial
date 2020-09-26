package dydko.tutorial.thymeleaf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/if-unless")
	public String users(Model model) {
		List<User> users = new ArrayList<User>();
		users.add(new User("Miroslaw", "miro@wp.pl", "ADMIN"));
		users.add(new User("Daniel", "zapa@wp.pl", "USER"));
		users.add(new User("Pietra", "oko@wp.pl", "USER"));
		model.addAttribute("users", users);
		return "if-unless";
	}

	@GetMapping("/switch-case")
	public String switchExample(Model model) {
		User user = new User("Miroslaw", "miro@wpaaaa.pl", "ADMIN");
		model.addAttribute("user", user);
		return "switch-case";
	}
}
