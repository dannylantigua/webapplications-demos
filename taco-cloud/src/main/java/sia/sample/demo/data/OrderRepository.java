package sia.sample.demo.data;

import sia.sample.demo.Order;

public interface OrderRepository {
	
	Order save(Order order);
	
}
