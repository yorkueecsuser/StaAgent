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

  // Mutant code
  @ThreadSafe
  public Obj customBuilderOk1Mutant() {
    Obj.Builder a = new Obj.Builder();
    a.setF("f");
    a.setG("g");
    return a.build();
  }

  @ThreadSafe
  public Obj customBuilderOk2Mutant() {
    Obj.Builder b = new Obj.Builder();
    return b.setF("f").setG("g").build();
  }

  @ThreadSafe
  public Obj customBuilderOk3Mutant() {
    Obj c = new Obj("a", "b");
    Obj.Builder d = new Obj.Builder();
    return d.setFromObj(c).build();
  }

  @ThreadSafe
  public Obj mutateBadMutant(Obj e) {
    e.g = "";
    return e;
  }

  @ThreadSafe
  public Obj buildThenMutateBadMutant(Obj f) {
    Obj.Builder g = new Obj.Builder();
    Obj h = g.setFromObj(f).build();
    f.g = "";
    return h;
  }
}

@ThreadSafe
class TopLevelBuilder {
  public String g;

  public void setG(String g) {
    this.g = g; // still want to warn if the builder is annotated ThreadSafe
  }

  // Mutant code
  @ThreadSafe
  public void setGMutant(String i) {
    this.g = i; // still want to warn if the builder is annotated ThreadSafe
  }
}

class MyBuilder {
  Obj mObj;

  public static MyBuilder create() {
    return new MyBuilder();
  }

  public MyBuilder setNestedPath(int i) {
    this.mObj.f = i;
    return this;
  }

  @ThreadSafe
  static void setNestedPathOk(int i) {
    MyBuilder.create().setNestedPath(1);
  }

  // Mutant code
  @ThreadSafe
  static void setNestedPathOkMutant(int j) {
    MyBuilder.create().setNestedPath(1);
  }
}