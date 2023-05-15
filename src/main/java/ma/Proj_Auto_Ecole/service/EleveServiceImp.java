package ma.Proj_Auto_Ecole.service;

import ma.Proj_Auto_Ecole.dto.ElevesDto;
import ma.Proj_Auto_Ecole.mappers.ElevesMappers;
import ma.Proj_Auto_Ecole.repositories.ElevesRepositories;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("EleveService")
public class EleveServiceImp implements ElevesService{
    private static final Logger LOGGER= LoggerFactory.getLogger(EleveServiceImp.class);
    private ElevesRepositories ElevesRepositories;
    private  ElevesMappers ElevesMappers= Mappers.getMapper(ElevesMappers.class) ;

    public EleveServiceImp(@Qualifier("EleveRepo") ElevesRepositories ElevesRepositories)
    {
        this.ElevesRepositories = ElevesRepositories;
    }


    @Override
    public ElevesDto create(ElevesDto dto) {
        LOGGER.debug("start method create dto : {} ",dto);
        return ElevesMappers.convertDto(ElevesRepositories.save(ElevesMappers.convertEntity(dto)));
    }

    @Override
    public ElevesDto update(ElevesDto dto) {
        LOGGER.debug("start method update dto : {} ",dto);
        return ElevesMappers.convertDto(ElevesRepositories.save(ElevesMappers.convertEntity(dto)));
    }

    @Override
    public boolean delete(String cin) {
        LOGGER.debug("Start method delete: {}",cin);
        ElevesRepositories.deleteById(cin);
        return true;
    }

    @Override
        public List<ElevesDto> select() {
            LOGGER.debug("start method select ");
            return ElevesMappers.convertDtos(ElevesRepositories.findAll());
    }
}
