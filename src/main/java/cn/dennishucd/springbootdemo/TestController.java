package cn.dennishucd.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

	@GetMapping("/1")
	public String test() {
//		User user = new User();
//		
//		user.setName("Dennis");
//		user.setEmployee(true);
//		
//		String str = DTools.Object2JsonStr(user);
//		
//		User newUser = DTools.JSONStr2Object(str, User.class);
		
		return "HelloWorld!";
//		return user.toString();
	}
}
