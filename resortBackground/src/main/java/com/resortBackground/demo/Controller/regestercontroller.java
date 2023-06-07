package com.resortBackground.demo.Controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resortBackground.demo.Model.SignupData;
import com.resortBackground.demo.Service.UserService;



@RestController
@CrossOrigin
@RequestMapping("/user")
public class regestercontroller {
	@Autowired
	UserService userv;
	@PostMapping("/rpost")
	public SignupData savevalue(@RequestBody SignupData r) {
		return userv.savevalues(r);
	}
	@PostMapping("/login")
	public String login(@RequestBody Map<String,String> loginDataMap)
	{
		String username = loginDataMap.get("username");
		String password = loginDataMap.get("password");
		String result = userv.loginCheckData(username, password);
		return result;
	}
	@PutMapping("/forgetpassword")
	public SignupData updateRecords (@RequestBody SignupData s) {
		return userv.updateRecords(s);
	}
	@GetMapping("/{username}")
    public ResponseEntity<SignupData> getUserByUserName(@PathVariable String username) {
        Optional<SignupData> user = userv.getUserByUserName(username);
        if (user.isPresent()) {
            return new ResponseEntity<>(user.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            
        }
    }
	  @PostMapping("/{username}/change-password")
	    public ResponseEntity<String> changePassword(
	            @PathVariable String username,
	            @RequestBody Map<String, String> request) {

	        String currentPassword = request.get("currentPassword");
	        String newPassword = request.get("newPassword");

	        try {
	        	userv.changePassword(username, currentPassword, newPassword);
	            return ResponseEntity.ok("Password changed successfully");
	        } catch (IllegalArgumentException e) {
	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
	        }
	    }
}


