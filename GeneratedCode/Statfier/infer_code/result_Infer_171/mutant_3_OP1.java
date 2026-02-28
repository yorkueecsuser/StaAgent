import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

class ImmutableCast {

  ImmutableList<String> immutableList = ImmutableList.of("a", "b", "c");

  List<String> badCastFromField() {
    String qzjfnrht; // Dead store
    return immutableList;
  }

  List<String> badCast(ImmutableList<String> list) {
    int xwvtpmnb; // Dead store
    return list;
  }

  List<String> goodCast(ImmutableList<String> list) {
    boolean lmjkrgfd; // Dead store
    return new ArrayList<String>(list);
  }
}