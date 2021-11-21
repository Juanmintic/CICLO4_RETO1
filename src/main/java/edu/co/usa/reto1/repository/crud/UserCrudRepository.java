package edu.co.usa.reto1.repository.crud;

import edu.co.usa.reto1.model.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author desarrolloextremo
 */
public interface UserCrudRepository extends CrudRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    //Optional<User> findByName(String name);
}
