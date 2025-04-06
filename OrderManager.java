public class OrderManager {
    private MyQueue<Order> orderQueue = new MyQueue<>();

    public void placeOrder(Order order) {
        orderQueue.enqueue(order);
        System.out.println("Order placed: ID=" + order.getId() + ", Book='" + order.getBookTitle() + "'");
    }

    public void processNextOrder() {
        if (!orderQueue.isEmpty()) {
            Order order = orderQueue.dequeue();
            System.out.println("Processing Order ID=" + order.getId() + ", Book='" + order.getBookTitle() + "'");
        } else {
            System.out.println("No orders to process.");
        }
    }
}