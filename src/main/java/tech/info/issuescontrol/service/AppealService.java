package tech.info.issuescontrol.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import tech.info.issuescontrol.mapper.AppealMapper;
import tech.info.issuescontrol.model.Appeal;
import tech.info.issuescontrol.model.AppealDto;
import tech.info.issuescontrol.model.Client;
import tech.info.issuescontrol.repository.AppealRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class AppealService {
    private final AppealRepository appealRepository;

    public AppealService(AppealRepository appealRepository) {
        this.appealRepository = appealRepository;
    }

    public void registration(AppealDto appealDto) {
        Appeal appeal = AppealMapper.INSTANCE.appealDtoToAppeal(appealDto);
        appeal.setDateTime(LocalDateTime.now());

        appealRepository.save(appeal);
    }

    public void update(Appeal appeal) {
        Optional<Appeal> found = appealRepository.findById(appeal.getId());
        if (found.isPresent()){
            appealRepository.save(appeal);
        }
        return;
    }

    public ResponseEntity getAllAppeals() {
        List<Appeal> appeals =  appealRepository.findAll();
        return new ResponseEntity(appeals, HttpStatus.OK);
    }

    public void delete(Integer id) {
        appealRepository.deleteById(id);

    }
}
