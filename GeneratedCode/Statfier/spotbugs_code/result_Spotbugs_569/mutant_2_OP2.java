import edu.umd.cs.findbugs.annotations.NonNull;
import edu.umd.cs.findbugs.annotations.Nullable;

class Bug2003267 {

  private String type = "";

  public void correct() {
    Object param = new Object();
    Works target = null;

    if (type.equals("a")) {
      target = new Works();
      target = new Works(); // Mutant: duplicated assignment
    } else if (type.equals("b")) {
      target = new Works();
      target = new Works(); // Mutant: duplicated assignment
    }

    target.bar(param); // < reports a "possible null pointer derefence" for
    // < target (NP_NULL_ON_SOME_PATH): Correctly detected
  }

  public void wrong() {
    Object param = new Object();
    DoesntWork target = null;

    if (type.equals("a")) {
      target = new DoesntWork();
      target = new DoesntWork(); // Mutant: duplicated assignment
    } else if (type.equals("b")) {
      target = new DoesntWork();
      target = new DoesntWork(); // Mutant: duplicated assignment
    }

    target.foo(param); // < reports a "Method call passes null for
    // < unconditionally dereferenced parameter" for param
    // < (NP_NULL_PARAM_DEREF): Wrong, param cannot be null
    // < as in the previous example, it is target that might
    // < be null
  }

  static class Works {
    /** the only difference with DoesntWork.foo() is that the parameter is annotated as Nullable */
    public void bar(@Nullable Object o) {}
  }

  static class DoesntWork {
    /** the only difference with Works.bar() is that the parameter is annotated as NonNull */
    public void foo(@NonNull Object o) {}
  }
}