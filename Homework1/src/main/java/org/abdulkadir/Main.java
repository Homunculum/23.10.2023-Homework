package org.abdulkadir;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //String mesaj = "Vade orani";

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");

        Product product3 = new Product();
        product3.setName("Kitchen aid Kahve Makinesi");

        /*product1.name = "Delonghi Kahve Makinesi";
         product1.unitPrice = 7500;
         product1.discount = 7;
         product1.unitsInStock = 3;
         product1.imageUrl = "bilmemne1.jpg";



         Product product2 = new Product();
         product2.name = "Smeg Kahve Makinesi";
         product2.unitPrice = 6500;
         product2.discount = 8;
         product2.unitsInStock = 4;
         product2.imageUrl = "bilmemne2.jpg";

         Product product3 = new Product();
         product3.name = "Kitchen aid Kahve Makinesi";
         product3.unitPrice = 4500;
         product3.discount = 9;
         product3.unitsInStock = 2;
         product3.imageUrl = "bilmemne3.jpg";*/

        Product[] products = {product1, product2, product3};
        System.out.println("<ul>");
        for (Product product : products) {

            System.out.println("<li>"+product.getName()+"</li>");
			/*System.out.println(product.unitPrice);
			System.out.println(product.discount);
			System.out.println(product.unitsInStock);
			System.out.println(product.imageUrl); */
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer= new IndividualCustomer();

        individualCustomer.setId(1);
        individualCustomer.setPhone("05448989796");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("abdulkadir");
        individualCustomer.setLastName("elsÄ±kma");


        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setPhone("15454545454");
        corporateCustomer.setTaxNumber("11111111111");
        corporateCustomer.setCompanyName("tobeto");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers = {individualCustomer,corporateCustomer};
    }

}