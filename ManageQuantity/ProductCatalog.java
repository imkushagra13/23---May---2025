package ManageQuantity;

import java.util.*;

public class ProductCatalog {
    private Map<Product,Integer> map=new HashMap<>();

    //add or update quantity
    public boolean addProduct(Product prod,int quantity){
        if(map.containsKey(prod)){
            System.out.println("Product Already Exist");
            return false;
        }
        map.put(prod,quantity);
        return true;
    }

    //retrive product
    public Product getProductIdBy(int productId){
        for(Product p:map.keySet()){
            if(p.getProductId()==productId) return p;
        }
        return null;
    }

    //update
    public boolean updateQuantity(int productId,int newQuantity){
        Product existing=getProductIdBy(productId);
        if(existing == null){
            map.put(existing,newQuantity);
            return true;
        }
        return false;
    }

    //delete product
    public boolean deleteProduct(int productId){
        Product p=getProductIdBy(productId);
        if(p!=null){
            map.remove(p);
            return true;
        }
        return false;
    }

    //all product with quantity
    public void displayAll(){
        for(Map.Entry<Product,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+", Quantity: "+entry.getValue());
        }
    }

    //sort by productid
    List<Map.Entry<Product,Integer>> sortById(){
        List<Map.Entry<Product,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort(Comparator.comparing(entry->entry.getKey().getProductId()));
        return list;
    }

    //sort by product name
    List<Map.Entry<Product,Integer>> sortByName(){
        List<Map.Entry<Product,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort(Comparator.comparing(entry->entry.getKey().getProductName()));
        return list;
    }


}
