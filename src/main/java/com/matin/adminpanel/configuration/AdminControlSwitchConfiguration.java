package com.matin.adminpanel.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "api.capabilities")
public class AdminControlSwitchConfiguration {

    private boolean adminControlSwitch;

    public void setAdminControlSwitch(boolean adminControlSwitch) {
        this.adminControlSwitch = adminControlSwitch;
    }

    public boolean isAdminControlSwitch() {
        return adminControlSwitch;
    }

}
