package com.matin.adminpanel.controller;

import com.matin.adminpanel.configuration.AdminControlSwitchConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AdminControlSwitchController {

    private final AdminControlSwitchConfiguration adminControlSwitchConfiguration;

    public AdminControlSwitchController(AdminControlSwitchConfiguration adminControlSwitchConfiguration) {
        this.adminControlSwitchConfiguration = adminControlSwitchConfiguration;
    }

    @PostMapping("/admin-switch")
    public ResponseEntity<String> updateAdminSwitch(@RequestParam boolean newSwitchValue) {
        adminControlSwitchConfiguration.setAdminControlSwitch(newSwitchValue);
        return ResponseEntity.ok("Admin switch updated successfully.");
    }

    @GetMapping("/adminControlSwitch")
    public ResponseEntity<Boolean> getAdminControlSwitch() {
        boolean adminControlSwitch = adminControlSwitchConfiguration.isAdminControlSwitch();
        return ResponseEntity.ok(adminControlSwitch);
    }
}
