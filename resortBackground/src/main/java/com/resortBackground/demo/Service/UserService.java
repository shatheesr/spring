package com.resortBackground.demo.Service;

import com.resortBackground.demo.Model.SignupData;
import com.resortBackground.demo.repository.regesterrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final regesterrepo rrepo;

    @Autowired
    public UserService(regesterrepo rrepo) {
        this.rrepo = rrepo;
    }

    public SignupData savevalues(SignupData r) {
        return rrepo.save(r);
    }

    public String loginCheckData(String username, String password) {
        SignupData user = rrepo.findByusername(username);
        if (user == null) {
            return "No User Found\nPlease Try Again!!!!";
        } else {
            // Check if the usernames match in a case-sensitive manner
            if (user.getUsername().equals(username)) {
                if (user.getPassword().equals(password)) {
                    return "Login Successful";
                } else {
                    return "Login Failed";
                }
            } else {
                return "Login Failed";
            }
        }
    }


    public SignupData updateRecords(SignupData s) {
        return rrepo.save(s);
    }

    public Optional<SignupData> getUserByUserName(String username) {
        return rrepo.findById(username);
    }

    public void changePassword(String username, String currentPassword, String newPassword) {
        Optional<SignupData> optionalUser = rrepo.findById(username);
        if (optionalUser.isEmpty()) {
            throw new IllegalArgumentException("User not found");
        }

        SignupData user = optionalUser.get();

        // Verify current password
        if (!user.getPassword().equals(currentPassword)) {
            throw new IllegalArgumentException("Current password is incorrect");
        }

        // Update password
        user.setPassword(newPassword);
        rrepo.save(user);
    }
}
