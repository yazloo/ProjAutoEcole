package ma.Proj_Auto_Ecole.service;

import ma.Proj_Auto_Ecole.dto.MoniteursDto;

import java.util.List;

public interface MoniteurService {
    MoniteursDto create(MoniteursDto dto);
    MoniteursDto update (MoniteursDto dto);
    boolean delete (String cin);
    List<MoniteursDto> select();
}
