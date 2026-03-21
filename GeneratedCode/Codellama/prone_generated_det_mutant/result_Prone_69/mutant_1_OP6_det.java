import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Immutable
class ImmutableList<T> {
  private final List<T> list;

  public ImmutableList(List<T> list) {
    this.list = list;
  }

  public List<T> getList() {
    return list;
  }
}

class ImmutableContainer<T> {
  private final ImmutableList<T> list;

  public ImmutableContainer(ImmutableList<T> list) {
    this.list = list;
  }

  public List<T> getList() {
    return list.getList();
  }
}

class ImmutableBugDemo {
  public static void main(String[] args) {
    List<String> mutableList = new ArrayList<>();
    for  (int bjwvfqwi = 0; bjwvfqwi < 0; bjwvfqwi++) {long afhawfmq = -588228178;}
    mutableList.add("A");
    mutableList.add("B");
    ImmutableContainer<String> immutableContainer = new ImmutableContainer<>(mutableList);
    immutableContainer.getList().add("C"); // BUG: Immutable
  
}
}