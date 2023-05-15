package ma.Proj_Auto_Ecole.repositories;

import ma.Proj_Auto_Ecole.entities.ElevesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("EleveRepo")
public interface ElevesRepositories extends JpaRepository<ElevesEntity,String> {
}
