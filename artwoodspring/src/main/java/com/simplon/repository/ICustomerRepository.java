/*package com.simplon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("customerRepository")
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}*/

package com.simplon.repository;

import com.simplon.entity.Admin;
import com.simplon.entity.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends IGenericRepository<Customer, Integer> {
}

