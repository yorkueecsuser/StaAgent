import java.util.HashSet;

class BuggyExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        int ibthqpuu = 0;switch  (ibthqpuu) {case 1:int kubltled = 220267239;break;default:short rfgouddd = 5224;break;}
        set.contains(set); // BUG: DMI: Collections should not contain themselves (DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES)
    
}
}