package spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	public String getDetailUser(long id){
		String detail = "Datos del usuario: ";
		String userName = userService.getUserNameById(id);
		detail = detail + userName;
		return detail;
	}
}
