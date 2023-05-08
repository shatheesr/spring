package com.LoanApplicationPortal.demo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LoanApplicationPortal.demo.Model.LoanApplicationModel;
import com.LoanApplicationPortal.demo.Model.UserModel;
import com.LoanApplicationPortal.demo.Service.UserService;




@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userv;
	
	@GetMapping("/getProfile")
	public List<UserModel> fetchAllDetails()
	{
		List<UserModel> a = userv.fetchAllProfile();
		return a;
	}
	
	@PostMapping("/login")
	public String validateUser(@RequestBody UserModel u)
	{
		return userv.valideteUser(u.getEmail(), u.getPassword());
	}
	
	@PostMapping("/signup")
	public UserModel addDetails(@RequestBody UserModel u)
	{
		return userv.saveUser(u);
	}
	
	@PutMapping("/update")
	public UserModel updateUser(@RequestBody UserModel id)
	{
		return userv.updateInfo(id);
	}
	@DeleteMapping("/deleteById/{id}")
	public String deleteUser(@PathVariable("id") int id)
	{
		userv.deleteInfo(id);
		return " user details deleted";
	}
	
	@GetMapping(value="/viewLoan/{user}")
	public LoanApplicationModel getById(@PathVariable int user)
	{
		LoanApplicationModel gbi=userv.getById(user);
		return gbi;
		
	}
}
