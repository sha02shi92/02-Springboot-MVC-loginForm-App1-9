package in.ashokit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.LoginForm;

@Controller
public class logincontroller {
      
	 @GetMapping("/login")
	  public String loginPage(Model model) {
		  LoginForm loginFormObj=new LoginForm();
		  model.addAttribute("loginForm", loginFormObj);
		  return "index";
	  }
	
	 @PostMapping("/checkLogin")
	 public String checkLogin(LoginForm FormObj, Model model) {
		 if(FormObj.getEmail().equals("shashank@gmail.com")
				 && FormObj.getPwd().equals("abc@123"))
		 {
			model.addAttribute("msg", "welcome to shashank gajbhiye white house"); 
			return "dashboard";
		 }else {
			 model.addAttribute("msg", "Invalid Credentials");
			 return "index";
		 }
		 
		 
		 
		 
		 
	 }
	 
	 
}
