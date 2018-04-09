package ee.ttu.vorgurakendused.training;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface TrainingRepository extends CrudRepository<Training, Integer> {

    public List<Training> findAll();
    public List<Training> findByTypeOrderByDateDesc(String type);
    public List<Training> findAllByOrderByDateDesc();

    @Transactional
    public Long deleteById(long id);
}
