package tech.info.issuescontrol.model;

import javax.persistence.*;
import javax.persistence.Entity;
import java.time.LocalDateTime;


@Entity
public class Appeal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDateTime dateTime;
    private AppealType appealType;
    private String description;
    private String clientName;

    public Appeal() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public AppealType getAppealType() {
        return appealType;
    }

    public void setAppealType(AppealType appealType) {
        this.appealType = appealType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}
