package com.LoanApplicationPortal.demo.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LoanApplicationPortal.demo.Model.LoanApplicationModel;
import com.LoanApplicationPortal.demo.Model.UserModel;
import com.LoanApplicationPortal.demo.Repository.LoanApplicationRepo;
import com.LoanApplicationPortal.demo.Repository.UserRepo;


@Service
public class UserService {
	@Autowired
	UserRepo urep;
	@Autowired
	LoanApplicationRepo lrep;
	public List<UserModel> fetchAllProfile()
	{
		List<UserModel> c = urep.findAll();
		return c;
	}
	public UserModel saveUser(UserModel l)
	{
		return urep.save(l);
	}
	public String valideteUser(String email,String password)
	{
		String result=" ";
		UserModel l=urep.findByEmail(email);
		if(l==null)
		{
			result="User not found";
		}
		else
		{
			if(l.getPassword().equals(password))
			{
				result="Login success";
			}
			else
			{
				result="Login failed";
			}
		}
		return result;
	}
	public LoanApplicationModel getById(int id)
	{
		LoanApplicationModel gbi=lrep.findById(id).get();
		return gbi;
		
	}
	
	public UserModel updateInfo(UserModel u)
	{
		return urep.saveAndFlush(u);
	}
	
	public void deleteInfo(int sno)
		{
			urep.deleteById(sno);
		}
}
