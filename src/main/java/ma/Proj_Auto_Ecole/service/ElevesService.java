package ma.Proj_Auto_Ecole.service;

import ma.Proj_Auto_Ecole.dto.ElevesDto;

import java.util.List;

public interface ElevesService {

    ElevesDto create(ElevesDto dto);
    ElevesDto update (ElevesDto dto);
    boolean delete (String cin);
    List<ElevesDto> select();

}

