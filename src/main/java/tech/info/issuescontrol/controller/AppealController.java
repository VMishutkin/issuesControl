package tech.info.issuescontrol.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import tech.info.issuescontrol.model.Appeal;
import tech.info.issuescontrol.model.AppealDto;
import tech.info.issuescontrol.model.Client;
import tech.info.issuescontrol.service.AppealService;

@RestController
@RequestMapping("/appeal")
public class AppealController {

    private final AppealService appealService;

    public AppealController(AppealService appealService) {
        this.appealService = appealService;
    }
    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    @PostMapping
    public ResponseEntity registrationAppeal(@RequestBody AppealDto appeal) {
        appealService.registration(appeal);
        return null;
    }

    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    @PatchMapping
    public ResponseEntity updateAppeal(@RequestBody Appeal appeal) {
        appealService.update(appeal);
        return null;
    }
    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    @DeleteMapping("/{id}")
    public ResponseEntity deleteAppeal(@PathVariable Integer id) {
        appealService.delete(id);
        return null;
    }
    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    @GetMapping
    public ResponseEntity getAllAppeals() {

        return appealService.getAllAppeals();
    }


}
