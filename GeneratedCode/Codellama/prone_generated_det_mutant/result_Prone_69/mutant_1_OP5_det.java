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
int bgzqloct = 0;switch  (bgzqloct) {case 1:int tlfihrju = 757635231;break;default:byte ewfudjsi = 91;break;}

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
    mutableList.add("A");
    mutableList.add("B");
    ImmutableContainer<String> immutableContainer = new ImmutableContainer<>(mutableList);
    immutableContainer.getList().add("C"); // BUG: Immutable
  }
}