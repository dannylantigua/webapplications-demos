package sia.sample.demo.data;

import java.util.Date;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import sia.sample.demo.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

    Order save(Order order);
    
    List<Order> findByDeliveryZip(String deliveryZip);
    
    List<Order> readrOrdersByDeliveryZipAndPlacedAtBetween (
        String deliveryZip, Date startDate, Date endDate);

}
