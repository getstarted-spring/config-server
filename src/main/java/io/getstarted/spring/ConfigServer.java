package io.getstarted.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServer {

  public static final void main(final String[] args) {
    SpringApplication.run(ConfigServer.class, args);
  }
}
