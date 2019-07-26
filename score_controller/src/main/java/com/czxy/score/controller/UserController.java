package com.czxy.score.controller;

import com.czxy.score.domain.Metting;
import com.czxy.score.domain.User;
import com.czxy.score.service.MettingService;
import com.czxy.score.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    MettingService mettingService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user, HttpServletRequest request){
        User u = userService.login(user);
        request.getSession().setAttribute("user",u);
        return new ResponseEntity<>("ok",HttpStatus.OK);
    }
	
	/**
		展示登录用户名
	*/
	@GetMapping("/searchName")
    public ResponseEntity<String> searchName(HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        if(user != null){
            return new ResponseEntity<>(user.getUsername(),HttpStatus.OK);
        }
        return new ResponseEntity<>("null",HttpStatus.NO_CONTENT);
    }

    @GetMapping("/findByUsername")
    public ResponseEntity<Metting> findByUsername(HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
       if (user!=null){
           Metting metting = mettingService.findByUsername(user.getUsername());
           return new ResponseEntity<>(metting,HttpStatus.OK);
       }else {
           return new ResponseEntity<>(HttpStatus.NO_CONTENT);
       }
    }
}
