package mainapp.repository;

import mainapp.entity.Post;
import org.springframework.data.repository.CrudRepository;

public interface CrudOperationRepository extends CrudRepository<Post, Integer> {
}
