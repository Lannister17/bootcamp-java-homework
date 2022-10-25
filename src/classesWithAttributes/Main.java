package classesWithAttributes;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(18, "Laptop", "Asus Notebook", 5000, 3, "asd");

        Product product1 = new Product();
        product1.setName("Laptop");
        product1.setId(17);
        product1.setDescription("Asus Laptop");
        product1.setPrice(5000);
        product1.setStockAmount(3);
        product1.setColor("");

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println("Ürün kodu : " + product.getCode());

    }
}
