package ma.Proj_Auto_Ecole.mappers;

import ma.Proj_Auto_Ecole.dto.ElevesDto;
import ma.Proj_Auto_Ecole.entities.ElevesEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ElevesMappers {

    ElevesDto convertDto(ElevesEntity entitie);
    ElevesEntity convertEntity(ElevesDto dto);
    List<ElevesDto> convertDtos (List<ElevesEntity>entities);
    List<ElevesEntity> convertEntitys (List<ElevesDto> dtos);

}
