package com.matin.adminpanel;

import com.matin.adminpanel.configuration.AdminControlSwitchConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

@SpringBootApplication
@EnableFeignClients("com.matin.adminpanel.feign")
@ImportAutoConfiguration({FeignAutoConfiguration.class})
@EnableConfigurationProperties(AdminControlSwitchConfiguration.class)
public class AdminPanelApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminPanelApplication.class, args);
	}

}
