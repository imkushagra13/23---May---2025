package ManageProduct;

import java.util.Objects;

public class Product {
    private int productId;
    private String productName;
    private String category;
    private double price;

    Product(int productId,String productName,String category,double price){
        this.productId=productId;
        this.productName=productName;
        this.category=category;
        this.price=price;
    }

    int getProductId(){return productId;}
    void setProductId(int productId){this.productId=productId;}

    String getProductName(){return productName;}
    void setProductName(String productName){this.productName=productName;}

    String getCategory(){return category;}
    void setCategory(String category){this.category=category;}

    double getPrice(){return price;}
    void setPrice(double price){this.price=price;}

    @Override
    public String toString(){
        return "Product[ID="+productId+", Name="+productName+", Category="+category+", Price="+price+"]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId && Double.compare(price, product.price) == 0 && Objects.equals(productName, product.productName) && Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, category, price);
    }
}
