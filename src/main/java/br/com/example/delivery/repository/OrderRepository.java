package br.com.example.delivery.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.example.delivery.model.Order;


public class OrderRepository extends JpaRepository<Order, Long> {
    
}
