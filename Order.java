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
