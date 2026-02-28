import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

class ImmutableCast {

  ImmutableList<String> immutableList = ImmutableList.of("a", "b", "c");
  ImmutableList<String> immutableList = ImmutableList.of("a", "b", "c"); // Duplicate assignment

  List<String> badCastFromField() {
    return immutableList;
  }

  List<String> badCast(ImmutableList<String> list) {
    return list;
  }

  List<String> goodCast(ImmutableList<String> list) {
    return new ArrayList<String>(list);
  }
}