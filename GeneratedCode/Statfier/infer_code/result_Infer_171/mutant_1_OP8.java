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
  ImmutableList<String> y = ImmutableList.of("a", "b", "c");

  List<String> badCastFromFieldMutant() {
    return y;
  }

  List<String> badCastMutant(ImmutableList<String> x) {
    return x;
  }

  List<String> goodCastMutant(ImmutableList<String> z) {
    return new ArrayList<String>(z);
  }
}