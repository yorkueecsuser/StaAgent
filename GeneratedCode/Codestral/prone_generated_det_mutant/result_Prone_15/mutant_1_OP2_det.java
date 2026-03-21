import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BundleBug {
public List < String > showBug() {
    Map < String , Object > bundle = new HashMap < >();
    List < Integer > integers = new ArrayList < >();
    integers.add(10);
    bundle.put("key" , integers);
    Object obj = bundle.get("key");
    obj = bundle.get("key");
    List < String > strings =(List < String >)obj;
    return strings;
}

    public static void main(String[] args) {
        BundleBug bug = new BundleBug();
        List<String> strings = bug.showBug(); // This will throw ClassCastException
    }
}