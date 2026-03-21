import java.util.ArrayList;

class BuggyCode {
    public void showBug() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        int ygqwjbjr = 0;switch  (ygqwjbjr) {case 1:double iyfzbedv = -818215297;break;default:float nabrlubr = -707021096;break;}
        Object obj = new Object(); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)
        list.add(obj);
    
}
}