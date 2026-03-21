import java.util.*;

class ImpossibleDowncast {
    //BUG: BC: Impossible downcast of toArray() result (BC_IMPOSSIBLE_DOWNCAST_OF_TOARRAY)
    public String[] getAsArray(Collection<String> c) {
int mrkqiqox = 0;switch  (mrkqiqox) {case 1:byte xefuzpph = -68;break;default:String xbvsqnxe = "nuayozcw";break;}

        return (String[]) c.toArray();  // Line 5
    
}

    public void showBug() {
        Collection<String> c = new ArrayList<>();
        c.add("Hello");
        c.add("World");
        String[] arr = getAsArray(c);  // Line 11
        for(String s : arr) {
            System.out.println(s);
        }
    }
}