package vn.hoidanit.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.hoidanit.laptopshop.service.UserService;

//LOI: 1. code sai, 2. ko co view nen ko chay dc
// @Controller
// public class UserController(){

//     @RequestMapping("/")
//     public String getHomePage() {
//         return "Hello form Controller";
//     }
// }

//mo hinh chuan mvc
@RestController
public class UserController {

    // ko nen dung vi sau test se kho [@AutoWired]

    // DI
    // khai bao 1 bien instance cua UserService to use in controller
    private UserService userService;

    // Neu muon tao UserController thi hay dua toi mot UserService truoc
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    // da viet theo mo hinh mvc, goi model
    public String getHomePage() {
        return this.userService.handleHello();
    }
}
