package com.timberbridgeetl;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/grades")
public class GradeController {
  @GetMapping
  public List<String> list() {
    return List.of("sample");
  }
}
