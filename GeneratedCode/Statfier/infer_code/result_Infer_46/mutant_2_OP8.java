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

  // Mutant 1: Renaming 'builder' to 'a'
  @ThreadSafe
  public void guavaBuilderOk_mutant1() {
    ImmutableList.Builder<String> a = new ImmutableList.Builder();
    a.add("foo");
    a.build();
  }

  // Mutant 2: Renaming 'builder' to 'b'
  @ThreadSafe
  public Obj customBuilderOk1_mutant2() {
    Obj.Builder b = new Obj.Builder();
    b.setF("f");
    b.setG("g");
    return b.build();
  }

  // Mutant 3: Renaming 'builder' to 'c'
  @ThreadSafe
  public Obj customBuilderOk2_mutant3() {
    Obj.Builder c = new Obj.Builder();
    return c.setF("f").setG("g").build();
  }

  // Mutant 4: Renaming 'builder' to 'd'
  @ThreadSafe
  public Obj customBuilderOk3_mutant4() {
    Obj obj = new Obj("a", "b");
    Obj.Builder d = new Obj.Builder();
    return d.setFromObj(obj).build();
  }

  // Mutant 5: Renaming 'builder' to 'e'
  @ThreadSafe
  public Obj buildThenMutateBad_mutant5(Obj input) {
    Obj.Builder e = new Obj.Builder();
    Obj output = e.setFromObj(input).build();
    input.g = "";
    return output;
  }
}

@ThreadSafe
class TopLevelBuilder {
  public String g;

  public void setG(String g) {
    this.g = g; // still want to warn if the builder is annotated ThreadSafe
  }
}

class MyBuilder {
  Obj mObj;

  public static MyBuilder create() {
    return new MyBuilder();
  }

  // Mutant 6: Renaming'mObj' to 'h'
  public MyBuilder setNestedPath(int i) {
    this.h.f = i;
    return this;
  }

  @ThreadSafe
  static void setNestedPathOk(int i) {
    MyBuilder.create().setNestedPath(1);
  }
}