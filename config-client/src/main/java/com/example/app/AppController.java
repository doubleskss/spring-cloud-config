package com.example.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class AppController {

  @Value("${amorepacific.dev.name}")
  private String name;

  @Value("${amorepacific.dev.team}")
  private String team;

  @Value("${amorepacific.dev.entest}")
  private String entest;

  @GetMapping("/name")
  public String getName(){
    return name;
  }

  @GetMapping("/team")
  public String getTeam(){
    return team;
  }

  @GetMapping("/entest")
  public String getEntest(){
    return entest;
  }


}
