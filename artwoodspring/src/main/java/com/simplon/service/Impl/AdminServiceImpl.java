package com.simplon.service.Impl;

import com.simplon.entity.Admin;
import com.simplon.repository.IAdminRepository;
import com.simplon.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AdminServiceImpl implements IAdminService {
    @Autowired
    private IAdminRepository adminRepository;

    @Override
    @Transactional
    public List<Admin> getAdmins(){
       return adminRepository.findAll();
    }

    @Override
    @Transactional
    public void saveAdmin(Admin theAdmin) {
        adminRepository.save(theAdmin);
    }

    @Override
    @Transactional
    public Admin getAdmin(int id) throws NullPointerException {
        return   adminRepository.findById(id).orElseThrow(
                ()->new NullPointerException("Admin with ID =${id} is not found"));
    }

    @Override
    @Transactional
    public void deleteAdmin(int id) {
        adminRepository.deleteById(id);
    }


}
