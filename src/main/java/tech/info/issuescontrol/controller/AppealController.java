package tech.info.issuescontrol.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/appeal")
public class AppealController {
    @PostMapping()
    public ResponseEntity<> registrationAppeal{

    }
    @PatchMapping()
    public ResponseEntity<> updateAppeal{

    }
    @DeleteMapping()
    public ResponseEntity<> deleteAppeal{

    }
    @GetMapping("")
    public ResponseEntity<> getAllAppeals{

    }


}
