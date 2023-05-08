package com.LoanApplicationPortal.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LoanApplicationPortal.demo.Model.LoanApplicationModel;
@Repository
public interface LoanApplicationRepo extends JpaRepository<LoanApplicationModel, Integer>  {

}
