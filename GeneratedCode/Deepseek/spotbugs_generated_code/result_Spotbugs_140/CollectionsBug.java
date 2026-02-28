import java.util.ArrayList;
import java.util.List;

class CollectionsBug {
    public boolean showBug(List<Object> list) {
        return list.contains(list); // BUG: DMI: Collections should not contain themselves (DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES)
    }
}