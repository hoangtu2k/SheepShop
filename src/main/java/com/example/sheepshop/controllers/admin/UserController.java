package com.example.sheepshop.controllers.admin;

import com.example.sheepshop.entitys.User;
import com.example.sheepshop.entitys.UserRole;
import com.example.sheepshop.services.impl.RoleService;
import com.example.sheepshop.services.impl.UserRoleService;
import com.example.sheepshop.services.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRoleService userRoleService;

    @Autowired
    private RoleService roleService;



    @RequestMapping("/logon")
    public String index() {
        return "admin/logon";
    }

    @GetMapping("/demo")
    public String test() {
        User u = new User();
        u.setCode("Demo");
        u.setFullname("Demo");
        u.setUsername("username");
        u.setPassword(new BCryptPasswordEncoder().encode("123456"));
        u.setImage("demo.jpg");
        u.setGender(1);
        u.setPhone("0123456789");
        u.setEmail("email@example.com");
        u.setEnabled(true);
        u.setStatus(0);
        // Lưu User vào cơ sở dữ liệu
        userService.save(u);

        UserRole ur = new UserRole();
        ur.setUser(u);
        ur.setRole(roleService.findById(1));

        userRoleService.save(ur);

        return "redirect:/logon";
    }

    @GetMapping("/404")
    public String error404() {
        return "admin/404";
    }


}
