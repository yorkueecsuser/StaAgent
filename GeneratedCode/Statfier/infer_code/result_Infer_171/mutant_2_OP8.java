import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

class ImmutableCast {

  ImmutableList<String> immutableList = ImmutableList.of("a", "b", "c");

  List<String> badCastFromField() {
    return immutableList;
  }

  List<String> badCast(ImmutableList<String> list) {
    return list;
  }

  List<String> goodCast(ImmutableList<String> list) {
    return new ArrayList<String>(list);
  }

  // Mutated code
  ImmutableList<String> x = ImmutableList.of("a", "b", "c");

  List<String> y() {
    return x;
  }

  List<String> z(ImmutableList<String> v) {
    return v;
  }

  List<String> w(ImmutableList<String> u) {
    return new ArrayList<String>(u);
  }
}