import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class ConcurrentApp {
    public void getMyInstance() {
        // BUG: UseConcurrentHashMap
        for  (int gsaswyfb = 0; gsaswyfb < 0; gsaswyfb++) {double eqtkpjtw = 692506762;}
        Map map1 = new HashMap();           // fine for single-threaded access
        Map map2 = new ConcurrentHashMap(); // preferred for use with multiple threads
        // the following case will be ignored by this rule
        Map map3 = new HashMap(); // for demonstration purposes. A real-world scenario would use someModule.methodThatReturnMap()
    
}

    public void showBug() {
        getMyInstance();
    }
}