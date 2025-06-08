package LMS;

import java.util.HashMap;

/// made this class gentic type as i dont know the type of book date that will
/// will be comming to stpore in the repo so made it genric
public class Repository<T> {
    HashMap<String,T> map=new HashMap<>();

    /// method to add data
    public void add(String id,T val){
        map.put(id,val);
    }

    ///  method to get details of paticular member or book
    public T get(String id) throws MemberNotFoundException{
        if(!map.containsKey(id)){
            throw new MemberNotFoundException("Member Not Found");
        }
        return map.get(id);
    }
}

/// exption to handle memer not found
class MemberNotFoundException extends Exception{
    public MemberNotFoundException(String message){
        super(message);
    }
}