package ManageProduct;

public class ProductMain {
    public static void main(String[] args) {
        //Add Products
        ProductManager pm=new ProductManager();
        pm.addProduct(new Product(101,"Phone","Electronics",23000.0));
        pm.addProduct(new Product(102,"Laptop","Electronics",67000.0));
        pm.addProduct(new Product(103,"Watch","Electronics",9000.0));

        //Display Product
        System.out.println("---------------All Products-----------");
        pm.getAllProduct().forEach(System.out::println);

        //Sort By Name
        System.out.println("------Products Sorted By Name-------");
        pm.sortByName().forEach(System.out::println);

        //update Product
        pm.updateProduct(new Product(102,"Laptop","E;lectronics",89000.0));

        // delete product
        pm.deleteProduct(103);
    }
}
