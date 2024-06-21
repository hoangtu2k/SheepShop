package com.example.sheepshop.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/chart/")
public class ChartController {

    @GetMapping("hien-thi")
    public String chart() {
        return "admin/chart/chart";
    }
}
