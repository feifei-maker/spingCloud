package com.whc.springcloud.springCloudClientAccount.modules.account.controller;

import com.whc.springcloud.springCloudClientAccount.modules.account.entity.User;
import com.whc.springcloud.springCloudClientAccount.modules.account.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: UserController <br/>
 * Description: <br/>
 * date: 2020/8/31 14:52<br/>
 *
 * @author FEI FEI<br/>
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 127.0.0.1/api/user/1 ---- get
     */
    @GetMapping("/user/{userId}")
    public User getUserByUserId(@PathVariable int userId) {
        User user  = userService.getUserByUserId(userId);
        System.out.println("-----" + user.getCities().size());
        return user;
    }

}

