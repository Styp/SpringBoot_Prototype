package ch.styp.dao;

import ch.styp.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by martin on 08.10.16.
 */
public interface CustomerDao extends CrudRepository<Customer, Long>  {
    List<Customer> findByLastName(String lastName);

}
