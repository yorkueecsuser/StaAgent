import java.util.ArrayList;
import java.util.List;

class CollectionBugDemonstration {
public List < Object > showBug() {
    List < Object > objs = new ArrayList < Object >();
    objs.add("Hello");
    objs.add(objs);
    objs.addAll(objs);
    boolean containsAll = objs.containsAll(objs);
    containsAll = objs.containsAll(objs);
    objs.removeAll(objs);
    boolean retainAll = objs.retainAll(objs);
    return objs;
}
}