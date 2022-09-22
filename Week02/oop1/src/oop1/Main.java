package oop1;

public class Main {

	public static void main(String[] args) {
		Product product1= new Product();
		product1.setName("Delhongi Kahve makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(4);
		product1.setImageUrl("bos.img");
		
		
		Product product2= new Product();
		product2.setName("Simens Kahve makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(5500);
		product2.setUnitsInStock(2);
		product2.setImageUrl("bos.img");
		
		Product product3= new Product();
		product3.setName("Vestel Kahve makinesi");
		product3.setDiscount(2);
		product3.setUnitPrice(1000);
		product3.setUnitsInStock(2);
		product3.setImageUrl("bos2.img");
		
		Product[] products = {product1,product2,product3};
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>"+product.getName() +"</li>");
		}
		System.out.println("</ul>");
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhoneNumber("3123312");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Fatih");
		individualCustomer.setLastName("Çalışkan");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("dsadasd");
		corporateCustomer.setCustomerNumber("21212");
		corporateCustomer.setPhoneNumber("02323122");
		corporateCustomer.setTaxNumber("11111");
		Customer[]	customers = {individualCustomer,corporateCustomer};
			System.out.println(individualCustomer.getPhoneNumber());

	}

}
