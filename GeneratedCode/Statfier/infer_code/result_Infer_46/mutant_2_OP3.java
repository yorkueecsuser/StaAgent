import codetoanalyze.java.annotation.ThreadSafe;
import com.google.common.collect.ImmutableList;

class Builders {

  static class Obj {
    final String f;
    String g;

    public Obj(String f, String g) {
      this.f = f;
      this.g = g;
    }

    public static class Builder {
      String f;
      String g;

      public Builder setFromObj(Obj input) {
        this.f = input.f;
        this.g = input.g;
        boolean condition = getCondition();
        if (condition) {
          // Unreachable code
          this.f = "unreachable";
        }
        return this;
      }

      public Obj build() {
        return new Obj(f, g);
      }

      public Builder setF(String f) {
        this.f = f;
        return this;
      }

      public Builder setG(String g) {
        this.g = g;
        return this;
      }
    }
  }

  @ThreadSafe
  public void guavaBuilderOk() {
    ImmutableList.Builder<String> builder = new ImmutableList.Builder();
    builder.add("foo");
    builder.build();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      builder.add("unreachable");
    }
  }

  @ThreadSafe
  public Obj customBuilderOk1() {
    Obj.Builder builder = new Obj.Builder();
    builder.setF("f");
    builder.setG("g");
    return builder.build();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      builder.setF("unreachable");
    }
  }

  @ThreadSafe
  public Obj customBuilderOk2() {
    Obj.Builder builder = new Obj.Builder();
    return builder.setF("f").setG("g").build();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      builder.setG("unreachable");
    }
  }

  @ThreadSafe
  public Obj customBuilderOk3() {
    Obj obj = new Obj("a", "b");
    Obj.Builder builder = new Obj.Builder();
    return builder.setFromObj(obj).build();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      builder.setFromObj(new Obj("unreachable", "unreachable"));
    }
  }

  @ThreadSafe
  public Obj mutateBad(Obj o) {
    o.g = "";
    return o;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      o.f = "unreachable";
    }
  }

  @ThreadSafe
  public Obj buildThenMutateBad(Obj input) {
    Obj.Builder builder = new Obj.Builder();
    Obj output = builder.setFromObj(input).build();
    input.g = "";
    return output;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      input.f = "unreachable";
    }
  }

  private boolean getCondition() {
    return false;
  }
}

@ThreadSafe
class TopLevelBuilder {
  public String g;

  public void setG(String g) {
    this.g = g; // still want to warn if the builder is annotated ThreadSafe
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      this.g = "unreachable";
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class MyBuilder {
  Obj mObj;

  public static MyBuilder create() {
    return new MyBuilder();
  }

  public MyBuilder setNestedPath(int i) {
    this.mObj.f = Integer.toString(i);
    return this;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      this.mObj.f = "unreachable";
    }
  }

  @ThreadSafe
  static void setNestedPathOk(int i) {
    MyBuilder.create().setNestedPath(1);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      MyBuilder.create().setNestedPath(2);
    }
  }

  private static boolean getCondition() {
    return false;
  }
}