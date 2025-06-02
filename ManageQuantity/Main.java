package ManageQuantity;

public class Main {
    public static void main(String[] args) {
        ProductCatalog pc=new ProductCatalog();
        pc.addProduct(new Product(101,"Laptop","Electronic",78000),45);
        pc.addProduct(new Product(102,"Phone","Electronic",32000),60);
        pc.addProduct(new Product(103,"Adapter","Electronic",1500),70);

        System.out.println("---------Catalog---------");
        pc.displayAll();

        System.out.println("-----Sorted By Name------");
        pc.sortByName().forEach(entry->System.out.println(entry.getKey()+" Quantity: "+entry.getValue()));

        pc.updateQuantity(103,34);
        pc.deleteProduct(102);


    }
}
