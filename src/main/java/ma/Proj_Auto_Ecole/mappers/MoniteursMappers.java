package ma.Proj_Auto_Ecole.mappers;

import ma.Proj_Auto_Ecole.dto.ElevesDto;
import ma.Proj_Auto_Ecole.dto.MoniteursDto;
import ma.Proj_Auto_Ecole.entities.ElevesEntity;
import ma.Proj_Auto_Ecole.entities.MoniteursEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface MoniteursMappers {

    MoniteursDto convertDto(MoniteursEntity entitie);
    MoniteursEntity convertEntity(MoniteursDto dto);
    List<MoniteursDto> convertDtos (List<MoniteursEntity>entities);
    List<MoniteursEntity> convertEntitys (List<MoniteursDto> dtos);
}
