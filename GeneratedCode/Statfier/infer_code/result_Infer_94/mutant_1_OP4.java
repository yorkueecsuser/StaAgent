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
      // Inserting unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because getCondition() returns false
        this.i = -1;
      } else {
        // This block will always execute
        this.i = i;
      }
      return getThis();
    }

    public T background() {
      return getThis();
    }

    @ReturnsOwnership
    abstract Component build();

    // Method to provide a dynamic condition that always returns false
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