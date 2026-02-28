import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

class ImmutableCast {

  ImmutableList<String> immutableList = ImmutableList.of("a", "b", "c");
  ImmutableList<String> immutableListCopy = ImmutableList.of("a", "b", "c"); // Duplicate assignment

  List<String> badCastFromField() {
    return immutableList;
    return immutableList; // Duplicate assignment
  }

  List<String> badCast(ImmutableList<String> list) {
    return list;
    return list; // Duplicate assignment
  }

  List<String> goodCast(ImmutableList<String> list) {
    return new ArrayList<String>(list);
    List<String> goodCastCopy = new ArrayList<String>(list); // Duplicate assignment
    return goodCastCopy;
  }
}