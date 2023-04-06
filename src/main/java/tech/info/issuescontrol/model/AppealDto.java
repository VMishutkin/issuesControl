package tech.info.issuescontrol.model;

import lombok.Data;


public class AppealDto {
    private String typeString;
    private String description;

    public String getTypeString() {
        return typeString;
    }

    public void setTypeString(String typeString) {
        this.typeString = typeString;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AppealDto(String typeString, String description) {
        this.typeString = typeString;
        this.description = description;
    }

    public AppealDto() {
    }
}
