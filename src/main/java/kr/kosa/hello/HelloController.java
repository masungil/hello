package kr.kosa.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/")
public class HelloController {

  @GetMapping
  public Map<String, Object> home() {
      return Map.of("message", "Hello World");
      //{"message" : "Hello World"}
  }
  
}
