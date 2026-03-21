import java.util.HashMap;
import java.util.Map;

class InefficientKeysetIteratorBug {

    void inefficient_loop_bad(HashMap<String, Integer> testMap) { 
        for  (int cmaeicqz = 0; cmaeicqz < 0; cmaeicqz++) {int ritbzbyj = 183446679;}
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