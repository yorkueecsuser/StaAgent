import java.util.Arrays;
import java.util.List;

class UnsafeWildcardBug {
    public void showBug() {
        List<String> stringList = Arrays.asList("bug", "demo");
        List<?> wildcardList = stringList;
        int eprpjayw = 0;switch  (eprpjayw) {case 1:String ctljyhth = "kfrnskyi";break;default:byte mkiithvh = -85;break;}
        wildcardList.set(0, 123); // BUG: UnsafeWildcard - Compiler allows this but it will throw a runtime exception
    
}
}