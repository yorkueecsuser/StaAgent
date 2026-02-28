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
      // Introduced an unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute
        System.out.println("This is an unreachable block");
      } else {
        // This block will always execute
        System.out.println("This block will always execute");
      }
      return getThis();
    }

    public T background() {
      return getThis();
    }

    @ReturnsOwnership
    abstract Component build();

    // Method to provide a dynamic condition
    private boolean getCondition() {
      return false; // Always returns false, ensuring the if-block is unreachable
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