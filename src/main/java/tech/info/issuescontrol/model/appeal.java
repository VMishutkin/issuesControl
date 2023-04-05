package tech.info.issuescontrol.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class appeal {
    private LocalDateTime dateTime;
    private AppealType appealType;
    private String description;
    private Client client;
}
