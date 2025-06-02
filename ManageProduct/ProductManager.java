package ManageProduct;
import java.util.*;
public class ProductManager {
    private Map<Integer,Product> map=new HashMap<>();

    //addProduct prevent duplicates in first entry
    boolean addProduct(Product prod){
        if(map.containsKey(prod.getProductId())){
            System.out.println("Duplicate Product ID is Not Allowed");
            return false;
        }
        map.put(prod.getProductId(),prod);
        return true;
    }

    //get product
    Product getProduct(int productId){
        return map.get(productId);
    }

    //update product
    boolean updateProduct(Product prod){
        if(!map.containsKey(prod.getProductId())){
            System.out.println("Product Not Found");
            return false;
        }
        map.put(prod.getProductId(),prod);
        return true;
    }

    //delete product
    boolean deleteProduct(int productId){
        return map.remove(productId)!=null;
    }

    //list all product
    List<Product> getAllProduct(){
        return new ArrayList<>(map.values());
    }

    //sort by id
    List<Product> sortById(){
        List<Product> list=getAllProduct();
        list.sort(Comparator.comparing(Product::getProductId));
        return list;
    }

    //sort by product name
    List<Product> sortByName(){
        List<Product> list=getAllProduct();
        list.sort(Comparator.comparing(Product::getProductName));
        return list;
    }

}
