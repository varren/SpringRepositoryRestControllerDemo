package ru.varren;

import org.springframework.data.repository.CrudRepository;
import ru.varren.model.Movement;

/**
 * Created by varren on 13.10.17.
 */
public interface MovementRepository extends CrudRepository<Movement, Integer> {
}
