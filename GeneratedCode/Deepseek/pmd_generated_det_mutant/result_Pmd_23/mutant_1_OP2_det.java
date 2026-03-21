import java.util.ArrayList;
import java.util.Collection;

class BugClass {
public Integer [] showBug() {
    Collection < Object > c = new ArrayList < >();
    Integer obj = new Integer(1);
    c.add(obj);
    Integer [] a = c.toArray(new Integer [ 0 ]);
    a = c.toArray(new Integer [ 0 ]);
    return a;
}
}