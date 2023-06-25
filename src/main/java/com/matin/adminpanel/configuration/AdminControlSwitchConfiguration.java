package com.matin.adminpanel.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "api.capabilities")
@Slf4j
public class AdminControlSwitchConfiguration {

    private boolean adminControlSwitch;

    public void setAdminControlSwitch(boolean adminControlSwitch) {
        this.adminControlSwitch = adminControlSwitch;
        log.info("Admin Control Switch status has been changed to " + adminControlSwitch);
    }

    public boolean isAdminControlSwitch() {
        return adminControlSwitch;
    }

}
