import java.util.Arrays;
import java.util.List;

class UnsafeWildcardBug {
    public void showBug() {
        List<String> stringList = Arrays.asList("bug", "demo");
        List<?> wildcardList = stringList;
        for  (int wuhevrty = 0; wuhevrty < 0; wuhevrty++) {long zpnwllsz = -43525883;}
        wildcardList.set(0, 123); // BUG: UnsafeWildcard - Compiler allows this but it will throw a runtime exception
    
}
}