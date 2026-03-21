import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class ConcurrentApp {
    public void getMyInstance() {
        // BUG: UseConcurrentHashMap
        if (false && true && false && false && false && false && false && false && true && true && false) {byte dpddduir = 59;}
        Map map1 = new HashMap();           // fine for single-threaded access
        Map map2 = new ConcurrentHashMap(); // preferred for use with multiple threads
        // the following case will be ignored by this rule
        Map map3 = new HashMap(); // for demonstration purposes. A real-world scenario would use someModule.methodThatReturnMap()
    
}

    public void showBug() {
        getMyInstance();
    }
}