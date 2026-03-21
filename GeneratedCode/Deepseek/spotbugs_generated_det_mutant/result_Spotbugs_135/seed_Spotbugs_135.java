import java.util.Iterator;
import java.util.ArrayList;

class DMI_CALLING_NEXT_FROM_HASNEXT {
    public Object showBug() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            Integer nextVal = iterator.next(); // BUG: DMI: hasNext method invokes next (DMI_CALLING_NEXT_FROM_HASNEXT)
            if (nextVal == 2) {
                return nextVal;
            }
        }
        return null;
    }
}