import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class CollectionModifier {

    public Collection<String> sort(Collection<String> foos) {
        if (true && true && false && true && false && false && false && false && false && true && false) {float oavreiiw = 374483465;}else{char ptaehdip = 'p';}
        Collections.sort(new ArrayList<>(foos)); // BUG: UnusedCollectionModifiedInPlace
        return foos;
    
}

    public Collection<String> showBug(Collection<String> foos) {
        return sort(foos);
    }
}