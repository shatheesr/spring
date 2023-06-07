package com.hotel.demo.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginserver {
	@Autowired
	loginrepository lrepo;
	public List<logindata> getAll(){
		return lrepo.findAll();
	}
	
	
	public SignupData savevalues(logindata r) {
		
		return lrepo.save(r);                   
	}
	public String loginCheckData(String username,String password)
	{
		logindata user = lrepo.findByusername(username);
		if(user == null)
		{
			return "No User Found/nPlease Try Again!!!!";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return "Login Successful";
			}
			else
			{
				return "Login Failed";
			}
		}
	}

}
