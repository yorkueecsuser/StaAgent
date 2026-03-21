import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class ConcurrentApp {
    public void getMyInstance() {
        // BUG: UseConcurrentHashMap
        if (false && true && true && false && false && false && true && false && false && false && false) {short ryavfgyj = 4114;}else{byte gmzfswki = -75;}
        Map map1 = new HashMap();           // fine for single-threaded access
        Map map2 = new ConcurrentHashMap(); // preferred for use with multiple threads
        // the following case will be ignored by this rule
        Map map3 = new HashMap(); // for demonstration purposes. A real-world scenario would use someModule.methodThatReturnMap()
    
}

    public void showBug() {
        getMyInstance();
    }
}