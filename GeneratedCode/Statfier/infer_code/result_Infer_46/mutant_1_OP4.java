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
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some unreachable code
          this.f = "unreachable";
        } else {
          // Another unreachable code
          this.g = "unreachable";
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      builder.add("unreachable");
    } else {
      // Another unreachable code
      builder.add("unreachable");
    }
  }

  @ThreadSafe
  public Obj customBuilderOk1() {
    Obj.Builder builder = new Obj.Builder();
    builder.setF("f");
    builder.setG("g");
    return builder.build();
  }

  @ThreadSafe
  public Obj customBuilderOk2() {
    Obj.Builder builder = new Obj.Builder();
    return builder.setF("f").setG("g").build();
  }

  @ThreadSafe
  public Obj customBuilderOk3() {
    Obj obj = new Obj("a", "b");
    Obj.Builder builder = new Obj.Builder();
    return builder.setFromObj(obj).build();
  }

  @ThreadSafe
  public Obj mutateBad(Obj o) {
    o.g = "";
    return o;
  }

  @ThreadSafe
  public Obj buildThenMutateBad(Obj input) {
    Obj.Builder builder = new Obj.Builder();
    Obj output = builder.setFromObj(input).build();
    input.g = "";
    return output;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is not a compile-time constant
  }
}

@ThreadSafe
class TopLevelBuilder {
  public String g;

  public void setG(String g) {
    this.g = g; // still want to warn if the builder is annotated ThreadSafe
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      this.g = "unreachable";
    } else {
      // Another unreachable code
      this.g = "unreachable";
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is not a compile-time constant
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
  }

  @ThreadSafe
  static void setNestedPathOk(int i) {
    MyBuilder.create().setNestedPath(1);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("unreachable");
    } else {
      // Another unreachable code
      System.out.println("unreachable");
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is not a compile-time constant
  }
}