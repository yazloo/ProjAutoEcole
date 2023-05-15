package ma.Proj_Auto_Ecole.repositories;

import ma.Proj_Auto_Ecole.entities.MoniteursEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("MoniteurRepo")
public interface MoniteursRespositories extends JpaRepository<MoniteursEntity,String> {
}
