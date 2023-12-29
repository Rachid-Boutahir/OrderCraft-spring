package com.simplon.service;

import com.simplon.entity.Admin;

import java.util.List;

public interface IAdminService {
    public List<Admin> getAdmins();

    public void saveAdmin(Admin theAdmin);

    public Admin getAdmin(int id);

    public void deleteAdmin(int id);
}
