package tech.info.issuescontrol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.info.issuescontrol.model.Appeal;

@Repository
public interface AppealRepository extends JpaRepository<Appeal, Integer> {
}
