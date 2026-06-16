import java.util.ArrayList;

public class Order {
	private int orderNumber;
	private CafeCustomer customer;
	private ArrayList<MenuItem> items;
	private boolean paid;

	private static int nextOrderNumber = 1;

	public Order(CafeCustomer customer) {
		this.orderNumber = nextOrderNumber++;
		this.customer = customer;
		this.items = new ArrayList<>();
		this.paid = false;
		}

	public void addItem(MenuItem item) {
	items.add(item);
	}

	public double calculateTotal() {
		double total = 0;
		for (MenuItem item : items) {
		total += item.getPrice();
	}
	return total;
	}

	public int countItems() {
	return items.size();
	}

	public void markAsPaid() {
	paid = true;
	}

	public static int getNextOrderNumber() {
	return nextOrderNumber;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("Order #").append(orderNumber).append("\n");
		result.append("Customer: ").append(customer.getFullData()).append("\n");
	
        result.append("Items:\n");

        for (MenuItem item : items) {
            result.append(" - ")
                  .append(item.getName())
                  .append(" (")
                  .append(item.getPrice())
                  .append(")\n");
        }

        result.append("Paid: ").append(paid);
        result.append("\nTotal: ").append(calculateTotal());

        return result.toString();
    }
}

