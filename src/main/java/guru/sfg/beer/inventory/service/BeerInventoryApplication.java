package guru.sfg.beer.inventory.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"guru.sfg.beer.inventory.service.BeerInventoryApplication"})
public class BeerInventoryApplication {

  public static void main(String[] args) {
    SpringApplication.run(BeerInventoryApplication.class, args);
  }
}
