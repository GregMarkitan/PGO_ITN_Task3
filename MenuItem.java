public class MenuItem {
	private String code;
	private String name;
	private double price;
	private String category;

	private static int productCount;

    	public MenuItem(String code, String name, double price, String category) {
       	 this.code = code;
         this.name = name;
         this.price = price;
         this.category = category;

        productCount++;
    }
