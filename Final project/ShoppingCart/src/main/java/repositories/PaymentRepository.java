package repositories;

import classes.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository <Payment, Long>{

	//Payment save(Payment payment);

}