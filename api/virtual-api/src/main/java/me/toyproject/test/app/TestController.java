package me.toyproject.test.app;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/virtual")
    public ResponseEntity<String> getTest() {
        return ResponseEntity.ok("test");
    }
}
