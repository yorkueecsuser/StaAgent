import codetoanalyze.java.annotation.ReturnsOwnership;
import javax.annotation.concurrent.ThreadSafe;

// no races should be reported here
// abstract getThis should get a default summary returning conditional ownership

@ThreadSafe
abstract class Component {
  abstract static class Builder<T extends Builder<T>> {
    abstract T getThis();

    private int i;

    public T set(int i) {
      this.i = i;
      return getThis();
    }

    public T background() {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable if statement
        System.out.println("This is an unreachable statement.");
      }
      return getThis();
    }

    @ReturnsOwnership
    abstract Component build();

    private boolean getCondition() {
      return false;
    }
  }
}

@ThreadSafe
class Column extends Component {
  static Component onCreateLayoutOk() {
    Component.Builder<?> builder = ColumnBuilder.create().background();
    return builder.set(0).build();
  }

  static class ColumnBuilder extends Component.Builder<ColumnBuilder> {
    static ColumnBuilder create() {
      return new ColumnBuilder();
    }

    @Override
    ColumnBuilder getThis() {
      return this;
    }

    @Override
    Column build() {
      return new Column();
    }
  }
}