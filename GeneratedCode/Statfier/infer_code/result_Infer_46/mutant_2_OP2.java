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
        this.f = input.f; // Mutation: Duplicate assignment
        this.g = input.g;
        return this;
      }

      public Obj build() {
        return new Obj(f, g);
      }

      public Builder setF(String f) {
        this.f = f;
        this.f = f; // Mutation: Duplicate assignment
        return this;
      }

      public Builder setG(String g) {
        this.g = g;
        this.g = g; // Mutation: Duplicate assignment
        return this;
      }
    }
  }

  @ThreadSafe
  public void guavaBuilderOk() {
    ImmutableList.Builder<String> builder = new ImmutableList.Builder();
    builder.add("foo");
    builder.add("foo"); // Mutation: Duplicate assignment
    builder.build();
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
    o.g = ""; // Mutation: Duplicate assignment
    return o;
  }

  @ThreadSafe
  public Obj buildThenMutateBad(Obj input) {
    Obj.Builder builder = new Obj.Builder();
    Obj output = builder.setFromObj(input).build();
    input.g = "";
    input.g = ""; // Mutation: Duplicate assignment
    return output;
  }
}

@ThreadSafe
class TopLevelBuilder {
  public String g;

  public void setG(String g) {
    this.g = g;
    this.g = g; // Mutation: Duplicate assignment // still want to warn if the builder is annotated ThreadSafe
  }
}

class MyBuilder {
  Obj mObj;

  public static MyBuilder create() {
    return new MyBuilder();
  }

  public MyBuilder setNestedPath(int i) {
    this.mObj.f = i;
    this.mObj.f = i; // Mutation: Duplicate assignment
    return this;
  }

  @ThreadSafe
  static void setNestedPathOk(int i) {
    MyBuilder.create().setNestedPath(1);
  }
}