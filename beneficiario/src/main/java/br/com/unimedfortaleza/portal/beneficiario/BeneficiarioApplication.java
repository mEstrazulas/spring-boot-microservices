package br.com.unimedfortaleza.portal.beneficiario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BeneficiarioApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeneficiarioApplication.class, args);
    }
}