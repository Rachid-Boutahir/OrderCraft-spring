package com.simplon.entity;

import com.simplon.emum.Roles;

import javax.persistence.*;

@Entity
@Table(name="admin")
public class Admin {
    @Id
    @Column(name = "admin_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int adminId ;
    @Column(name = "email",length = 30, nullable = false)
    private String email;
    @Column(name = "password",length = 10,nullable = false)
    private String password;
    @Column(name = "fullname",length = 30,nullable = false)
    private String fullName;
    @Column(name = "role",length = 20,nullable = true)
    private Roles role;

    public Admin() {
    }

    public Admin(String email, String password, String fullName, Roles role) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.role = role;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Admin{" +
                    "adminId=" + adminId +
                    ", email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    ", fullName='" + fullName + '\'' +
                    ", role=" + role +
                '}';
    }
}
