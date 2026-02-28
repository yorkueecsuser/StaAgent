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
  public void guavaBuilderOkMutant() {
    ImmutableList.Builder<String> x = new ImmutableList.Builder();
    x.add("foo");
    x.build();
  }

  @ThreadSafe
  public Obj customBuilderOk1Mutant() {
    Obj.Builder y = new Obj.Builder();
    y.setF("f");
    y.setG("g");
    return y.build();
  }

  @ThreadSafe
  public Obj customBuilderOk2Mutant() {
    Obj.Builder z = new Obj.Builder();
    return z.setF("f").setG("g").build();
  }

  @ThreadSafe
  public Obj customBuilderOk3Mutant() {
    Obj a = new Obj("a", "b");
    Obj.Builder b = new Obj.Builder();
    return b.setFromObj(a).build();
  }

  @ThreadSafe
  public Obj mutateBadMutant(Obj c) {
    c.g = "";
    return c;
  }

  @ThreadSafe
  public Obj buildThenMutateBadMutant(Obj d) {
    Obj.Builder e = new Obj.Builder();
    Obj f = e.setFromObj(d).build();
    d.g = "";
    return f;
  }
}

@ThreadSafe
class TopLevelBuilder {
  public String g;

  public void setG(String g) {
    this.g = g; // still want to warn if the builder is annotated ThreadSafe
  }

  // Mutant code
  public void setGMutant(String h) {
    this.g = h;
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
  public MyBuilder setNestedPathMutant(int j) {
    this.mObj.f = j;
    return this;
  }

  @ThreadSafe
  static void setNestedPathOkMutant(int k) {
    MyBuilder.create().setNestedPathMutant(k);
  }
}