import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

class ImmutableCast {

  ImmutableList<String> immutableList = ImmutableList.of("a", "b", "c");

  List<String> badCastFromField() {
    return immutableList;
    String qzjfnxwt; // Dead store
  }

  List<String> badCast(ImmutableList<String> list) {
    return list;
    int xwvfrtgb; // Dead store
  }

  List<String> goodCast(ImmutableList<String> list) {
    return new ArrayList<String>(list);
    boolean lmnpqrst; // Dead store
  }
}