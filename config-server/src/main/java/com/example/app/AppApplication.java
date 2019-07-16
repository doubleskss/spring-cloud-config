package com.example.app;

import javax.annotation.Priority;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.security.crypto.encrypt.TextEncryptor;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableConfigServer
public class AppApplication {

  public static void main(String[] args) {
    SpringApplication.run(AppApplication.class, args);
  }

  /**
   * 커스텀 암복호화모듈을 사용하여 진행하는 경우 아래의 TextEncryptor를 재정의하여 진행
   * Priority를 지정하지 않으면 중복객체 오류 발생
   */
  @Component
  @Priority(0)
  static class CustomTextEncryptor implements TextEncryptor {

    @Override
    public String encrypt(String text) {
      return "this_is_encrypt";
    }

    @Override
    public String decrypt(String encryptedText) {
      return "this_is_decrypt";
    }
  }

}
