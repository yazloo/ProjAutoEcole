package ma.Proj_Auto_Ecole.service;

import ma.Proj_Auto_Ecole.dto.MoniteursDto;
import ma.Proj_Auto_Ecole.mappers.ElevesMappers;
import ma.Proj_Auto_Ecole.mappers.MoniteursMappers;
import ma.Proj_Auto_Ecole.repositories.ElevesRepositories;
import ma.Proj_Auto_Ecole.repositories.MoniteursRespositories;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("MoniteurService")
public class MoniteurServiceImp implements MoniteurService{
    private static final Logger LOGGER= LoggerFactory.getLogger(MoniteurServiceImp.class);
    private MoniteursRespositories MoniteursRespositories;

    private MoniteursMappers MoniteursMappers= Mappers.getMapper(MoniteursMappers.class);

    public MoniteurServiceImp(@Qualifier("MoniteurRepo") MoniteursRespositories MoniteursRespositories)
    {
        this.MoniteursRespositories = MoniteursRespositories;
    }


    @Override
    public MoniteursDto create(MoniteursDto dto) {
        LOGGER.debug("start method create dto : {} ",dto);
        return MoniteursMappers.convertDto(MoniteursRespositories.save(MoniteursMappers.convertEntity(dto)));
    }

    @Override
    public MoniteursDto update(MoniteursDto dto) {
        LOGGER.debug("start method update dto : {} ",dto);
        return MoniteursMappers.convertDto(MoniteursRespositories.save(MoniteursMappers.convertEntity(dto)));
    }

    @Override
    public boolean delete(String cin) {
        LOGGER.debug("Start method delete: {}",cin);
        MoniteursRespositories.deleteById(cin);
        return true;
    }

    @Override
    public List<MoniteursDto> select() {
        LOGGER.debug("start method select ");
        return MoniteursMappers.convertDtos(MoniteursRespositories.findAll());
    }
}
