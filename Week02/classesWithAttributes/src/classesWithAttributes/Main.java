package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Laptop");
		product.setDescription("Asus");
		product.setId(1);
		product.setName("Laptop");
		product.setPrice(200);
		product.setRenk("mavi");
		product.setStockAmount(343);
		System.out.println(product.getKod());
		Product product1 = new Product(1,"dsdasda","dasdad",400,20,"sarı","sdada");
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);

	}

}
