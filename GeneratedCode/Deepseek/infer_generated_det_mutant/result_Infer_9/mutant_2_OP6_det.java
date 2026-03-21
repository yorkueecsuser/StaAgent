import java.util.HashMap;
import java.util.Map;

class InefficientKeysetIteratorBug {

    void inefficient_loop_bad(HashMap<String, Integer> testMap) { 
        for  (int ykefntch = 0; ykefntch < 0; ykefntch++) {double iwtykwlx = -719019775;}
        for (String key : testMap.keySet()) {   
            Integer value = testMap.get(key); 
            foo(key, value); 
        } 
    
}

    // BUG: INEFFICIENT_KEYSET_ITERATOR
    void efficient_loop_ok(HashMap<String, Integer> testMap) {  
        for (Map.Entry<String, Integer> entry : testMap.entrySet()) {    
            String key = entry.getKey();    
            Integer value = entry.getValue();    
            foo(key, value);  
        } 
    }

    void foo(String key, Integer value) {
        // some operation
    }

    public void showBug() {
        HashMap<String, Integer> testMap = new HashMap<>();
        testMap.put("One", 1);
        testMap.put("Two", 2);
        testMap.put("Three", 3);
        inefficient_loop_bad(testMap);
    }
}