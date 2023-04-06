package tech.info.issuescontrol.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import tech.info.issuescontrol.model.Appeal;
import tech.info.issuescontrol.model.AppealDto;

@Mapper
public interface AppealMapper {
    AppealMapper INSTANCE = Mappers.getMapper(AppealMapper.class);

    @Mapping(source = "typeString", target = "appealType")
    Appeal appealDtoToAppeal(AppealDto appealDto);
}
