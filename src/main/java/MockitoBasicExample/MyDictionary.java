package MockitoBasicExample;

import java.util.HashMap;

public class MyDictionary {
    HashMap<String,String> map=new HashMap<String,String>();
    public void add(String word,String meaning){
        map.put(word,meaning);
    }
    public String getMeaning(String word){
        return map.get(word);
    }
}
