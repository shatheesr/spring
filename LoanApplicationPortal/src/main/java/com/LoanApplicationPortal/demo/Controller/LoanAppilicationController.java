package com.LoanApplicationPortal.demo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.LoanApplicationPortal.demo.Model.LoanApplicationModel;
import com.LoanApplicationPortal.demo.Service.LoanAppilicatinService;



@RestController
@RequestMapping("/admin")

public class LoanAppilicationController {
	@Autowired
	LoanAppilicatinService lser;
	@GetMapping(value="/getAllLoans")
	public List<LoanApplicationModel> get()
	{
		List<LoanApplicationModel> l=lser.get();
		return l;
	}

	@PostMapping("/addLoans")
	public LoanApplicationModel addLoans(@RequestBody LoanApplicationModel la)
	{
		return lser.saveLoans(la);
	}
	
	@PutMapping("/changeLoans")
	public LoanApplicationModel updateLoans(@RequestBody LoanApplicationModel loanId)
	{
		return lser.changeLoans(loanId);
	}
	
	@DeleteMapping("/deleteLoans")
	public String deleteLoans(@RequestParam ("loanId") int loanId)
	{
		lser.deleteLoan(loanId);
		return " loan details deleted";
	}


}
