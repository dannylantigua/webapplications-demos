package sia.sample.demo.data;

import java.awt.print.Pageable;
import java.util.Date;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import sia.sample.demo.Order;
import sia.sample.demo.User;

public interface OrderRepository extends CrudRepository<Order, Long> {

    Order save(Order order);
    
    List<Order> findByDeliveryZip(String deliveryZip);
    
    List<Order> readrOrdersByDeliveryZipAndPlacedAtBetween (
        String deliveryZip, Date startDate, Date endDate);
    
    List<Order> findByUserOrderByPlaceAtDesc(User user, Pageable pageable);

}
