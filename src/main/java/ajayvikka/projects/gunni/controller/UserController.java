package ajayvikka.projects.gunni.controller;

import ajayvikka.projects.gunni.exceptions.GunniExceptionFormat;
import ajayvikka.projects.gunni.exceptions.UserNotFoundException;
import ajayvikka.projects.gunni.model.BaseUser;
import ajayvikka.projects.gunni.model.UserLogin;
import ajayvikka.projects.gunni.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/gunni/login")
    public ResponseEntity<BaseUser> checkUserLogin(@RequestBody UserLogin userLogin) {
        BaseUser baseUser = userService.validateUserCredentials(userLogin);
        if(baseUser != null)
            return new ResponseEntity<BaseUser>(baseUser, HttpStatus.OK);
        return new ResponseEntity<BaseUser>(baseUser, HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<GunniExceptionFormat> userCredentialsExceptionHandler(UserNotFoundException userNotFoundException) {
        return new ResponseEntity<GunniExceptionFormat>(new GunniExceptionFormat(userNotFoundException.getMessage()), HttpStatus.NOT_FOUND);
    }

}
