package com.simplon.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simplon.entity.Admin;
import com.simplon.service.IAdminService;


@Controller
@RequestMapping("/admin")
public class AdminController {
    private static final Logger Log = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    private IAdminService adminService;

    @GetMapping("/show")
    public String showFormAdminToAdd(Model objModel) {
        Log.debug("inside this page 'Admin-form-add.html' there is a handler methode ");
        Admin admin = new Admin();
        objModel.addAttribute("admin",admin);

        return "/Admin/Admin-form-add";
    }

    @GetMapping("/list")
    public String listAdmin(Model objModel) {
        List<Admin> listAdmin = adminService.getAdmins();
        objModel.addAttribute("adminlist",listAdmin);
        return "Admin/Admin-list";
    }

    @GetMapping("/save")
    public String SaveAdmin(@ModelAttribute("admin") Admin objAdmin) {
        adminService.saveAdmin(objAdmin);
        return "redirect:Admin/list";
    }

    @GetMapping("/Update")
    public String showFormAdminToUpdate(@RequestParam("adminId") int id, Model objModel )throws NullPointerException{
        Admin admin = adminService.getAdmin(id);
        objModel.addAttribute("admin", admin);

        return "Admin/Admin-form-update";
    }

    @GetMapping("/delete-admin")
    public String deleteAdmin(@ModelAttribute("adminId") int id) throws NullPointerException {
        adminService.deleteAdmin(id);

        return "redirect:Admin/list-admin";
    }
}
