package com.matin.adminpanel.controller;

import com.matin.adminpanel.configuration.AdminControlSwitchConfiguration;
import io.swagger.v3.oas.annotations.Operation;
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
    @Operation(summary = "Updates admin switch control"
            , description = "This API updates the admin switch control in RUNTIME. " +
            "pls notice that the value by default is set to true and when changed through this api" +
            "the change will not be persisted.")
    public ResponseEntity<String> updateAdminSwitch(@RequestParam boolean newSwitchValue) {
        adminControlSwitchConfiguration.setAdminControlSwitch(newSwitchValue);
        return ResponseEntity.ok("Admin switch updated successfully.");
    }

    @GetMapping("/adminControlSwitch")
    @Operation(summary = "Returns the admin control switch value"
            , description = "Returns the admin control switch value")
    public ResponseEntity<Boolean> getAdminControlSwitch() {
        boolean adminControlSwitch = adminControlSwitchConfiguration.isAdminControlSwitch();
        return ResponseEntity.ok(adminControlSwitch);
    }
}
