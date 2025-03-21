import java.util.List;

import br.inatel.dm112.logistica.logistica_dm112.services.entity.Order;

public interface OrderInterface {

	public Order getOrder(Integer orderNumber);

	public List<Order> searchOrders(String cpf);

	public void updateOrder(Order order, Integer orderNumber);

	public void startOrderPayment(Integer orderNumber);

	public void confirmOrderPayment(Integer orderNumber);

	public List<Order> getAllOrders();
}
