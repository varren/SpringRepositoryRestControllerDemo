package ru.varren;

import org.springframework.data.repository.CrudRepository;
import ru.varren.model.PaymentType;

/**
 * Created by varren on 13.10.17.
 */
public interface PaymentTypeRepository extends CrudRepository<PaymentType, Integer> {
}
