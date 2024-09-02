public class Main {
    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAO();

        // Create a new product
        Product product = new Product();
        product.setName("Laptop");
        product.setDescription("High-end gaming laptop");
        product.setPrice(1500.00);
        product.setQuantity(10);
        productDAO.addProduct(product);

        // Read product by ID
        Product fetchedProduct = productDAO.getProductById(1);
        System.out.println("Fetched Product: " + fetchedProduct.getName());

        // Update product
        fetchedProduct.setPrice(1400.00);
        productDAO.updateProduct(fetchedProduct);

        // Delete product
        productDAO.deleteProduct(fetchedProduct.getId());

        // Get all products
        List<Product> products = productDAO.getAllProducts();
        for (Product p : products) {
            System.out.println("Product Name: " + p.getName());
        }
    }
}
