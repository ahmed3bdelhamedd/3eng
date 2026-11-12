package com.eng3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/admin")
    public String showAdminDashboard(Model model) {
        // تمرير البيانات الثابتة للعرض فقط
        model.addAttribute("totalCourses", 5);
        model.addAttribute("totalStudents", 120);
        model.addAttribute("pendingPayments", 0);
        model.addAttribute("platformName", "3eng Platform");
        
        return "admin_dashboard"; // اسم ملف الـ HTML للواجهة
    }
}
