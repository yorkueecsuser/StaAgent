import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;

class HoistGlobal {

  public static int svar = 0;

  int read_global() {
    return svar;
  }

  int return_one() {
    return 1;
  }

  class Foo {
    void set() {
      svar = 5;
    }

    int read_global() {
      return svar;
    }

    int return_zero() {
      return 0;
    }
  }

  int global_modification_dont_hoist_FP(int size) {
    Foo f = new Foo();
    int d = 0;
    for (int i = 0; i < size; i++) {
      d += read_global(); // don't hoist since set() changes a global var in the loop
      f.set();
      f.read_global(); // don't hoist
    }
    return d;
  }

  int global_modification_hoist(ArrayList<?> list) {
    Foo f = new Foo();
    int d = 0;
    for (int i = 0; i < list.size(); i++) {
      d += return_one(); // ok to hoist
      f.set(); // don't invalidate size()
      f.return_zero(); // ok to hoist since doesn't read global
    }
    return d;
  }

  void call_global_modification_dont_hoist(int size) {
    for (int i = 0; i < size; i++) {
      global_modification_dont_hoist_FP(size);
    }
  }

  private void processModulesDirectory_dont_hoist_FP(
      Set<String> modulesToDelete, String[] existingFiles) {
    final AppModuleFileInfo fInfo = new AppModuleFileInfo();
    for (String existingFile : existingFiles) {
      fInfo.setFileName(existingFile);
      final boolean delete = modulesToDelete.contains(fInfo.mModuleName);
    }
  }

  private void processModulesDirectory_param_dont_hoist_FP(
      Set<String> modulesToDelete,
      String[] existingFiles,
      AppModuleFileInfo fInfo,
      AppModuleFileInfo fInfo2) {
    for (String existingFile : existingFiles) {
      fInfo.setFileName(existingFile);

      final boolean delete = modulesToDelete.contains(fInfo2.mModuleName);
    }
  }

  private void processModulesDirectory_hoist(Set<Integer> modulesToDelete, String[] existingFiles) {
    final AppModuleFileInfo fInfo = new AppModuleFileInfo();
    for (String existingFile : existingFiles) {
      fInfo.setFileName(existingFile);
      final boolean delete = modulesToDelete.contains(fInfo.x);
    }
  }

  void remove_first_dont_hoist(LinkedList<String> list) {

    while (list.size() >= 10) {
      list.removeFirst();
    }
  }

  String get_first_hoist_FN(LinkedList<String> list, String s) {
    for (int i = 0; i <= 10; i++) {
      String first = list.getFirst(); // list is invalidated
      if (list.contains(s)) { // hoist
        return first;
      }
    }
    return "";
  }

  // Mutated code
  int global_modification_dont_hoist_FP_mutated(int b) {
    Foo a = new Foo();
    int c = 0;
    for (int j = 0; j < b; j++) {
      c += read_global(); // don't hoist since set() changes a global var in the loop
      a.set();
      a.read_global(); // don't hoist
    }
    return c;
  }

  int global_modification_hoist_mutated(ArrayList<?> z) {
    Foo y = new Foo();
    int w = 0;
    for (int k = 0; k < z.size(); k++) {
      w += return_one(); // ok to hoist
      y.set(); // don't invalidate size()
      y.return_zero(); // ok to hoist since doesn't read global
    }
    return w;
  }

  void call_global_modification_dont_hoist_mutated(int v) {
    for (int l = 0; l < v; l++) {
      global_modification_dont_hoist_FP_mutated(v);
    }
  }

  private void processModulesDirectory_dont_hoist_FP_mutated(
      Set<String> u, String[] t) {
    final AppModuleFileInfo r = new AppModuleFileInfo();
    for (String q : t) {
      r.setFileName(q);
      final boolean p = u.contains(r.mModuleName);
    }
  }

  private void processModulesDirectory_param_dont_hoist_FP_mutated(
      Set<String> o,
      String[] n,
      AppModuleFileInfo m,
      AppModuleFileInfo e) {
    for (String d : n) {
      m.setFileName(d);

      final boolean c = o.contains(e.mModuleName);
    }
  }

  private void processModulesDirectory_hoist_mutated(Set<Integer> g, String[] f) {
    final AppModuleFileInfo h = new AppModuleFileInfo();
    for (String i : f) {
      h.setFileName(i);
      final boolean j = g.contains(h.x);
    }
  }

  void remove_first_dont_hoist_mutated(LinkedList<String> k) {

    while (k.size() >= 10) {
      k.removeFirst();
    }
  }

  String get_first_hoist_FN_mutated(LinkedList<String> s, String t) {
    for (int r = 0; r <= 10; r++) {
      String q = s.getFirst(); // list is invalidated
      if (s.contains(t)) { // hoist
        return q;
      }
    }
    return "";
  }
}

class AppModuleFileInfo {

  static String mModuleName;
  static Integer x;

  void setFileName(String fileName) {
    mModuleName = fileName;
  }
}