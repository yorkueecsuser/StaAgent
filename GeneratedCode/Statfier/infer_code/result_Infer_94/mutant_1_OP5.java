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
      return getThis();
    }

    @ReturnsOwnership
    abstract Component build();

    // Introduced unreachable switch statement
    private boolean getUnreachableCondition() {
      return false;
    }

    public void someMethod() {
      boolean condition = getUnreachableCondition();
      switch (condition) {
        case true:
          // This case is unreachable
          System.out.println("This is an unreachable case.");
          break;
        default:
          // Default case
          break;
      }
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

    // Introduced unreachable switch statement
    private boolean getUnreachableCondition() {
      return false;
    }

    public void someMethod() {
      boolean condition = getUnreachableCondition();
      switch (condition) {
        case true:
          // This case is unreachable
          System.out.println("This is an unreachable case in ColumnBuilder.");
          break;
        default:
          // Default case
          break;
      }
    }
  }
}