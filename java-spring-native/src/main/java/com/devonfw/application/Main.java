package com.devonfw.application;

import org.hibernate.boot.model.naming.ImplicitNamingStrategy;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyLegacyJpaImpl;
import org.hibernate.boot.model.naming.PhysicalNamingStrategy;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.postgresql.Driver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.nativex.hint.TypeHint;

@SpringBootApplication
@EnableJpaRepositories()
@TypeHint(types = Driver.class, typeNames = "org.postgresql.Driver")
@TypeHint(types = { ImplicitNamingStrategyLegacyJpaImpl.class,
    PhysicalNamingStrategyStandardImpl.class }, typeNames = {
        "org.hibernate.boot.model.naming.ImplicitNamingStrategyLegacyJpaImpl",
        "org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl" })
public class Main {

  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }

  @Bean
  public PhysicalNamingStrategy physical() {
    return new PhysicalNamingStrategyStandardImpl();
  }

  @Bean
  public ImplicitNamingStrategy implicit() {
    return new ImplicitNamingStrategyLegacyJpaImpl();
  }

}
