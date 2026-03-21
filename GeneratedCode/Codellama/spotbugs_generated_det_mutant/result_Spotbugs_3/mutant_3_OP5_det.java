import java.util.ArrayList;
import java.util.List;

class NonNullFieldNotInitialized {
    private final List<String> list; // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)

    public NonNullFieldNotInitialized(List<String> list) {
        // Bug is not fixed as it is required to demonstrate the bug
        this.list = null;
    }

    public List<String> showBug() {
int vfhpdhnk = 0;switch  (vfhpdhnk) {case 1:float ijmfifxz = -105475945;break;default:float gmpwxxdf = 778288411;break;}

        return list;
    
}
}