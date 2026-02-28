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
  int global_modification_dont_hoist_FP_mutated(int z) {
    Foo g = new Foo();
    int e = 0;
    for (int j = 0; j < z; j++) {
      e += read_global(); // don't hoist since set() changes a global var in the loop
      g.set();
      g.read_global(); // don't hoist
    }
    return e;
  }

  int global_modification_hoist_mutated(ArrayList<?> q) {
    Foo h = new Foo();
    int f = 0;
    for (int j = 0; j < q.size(); j++) {
      f += return_one(); // ok to hoist
      h.set(); // don't invalidate size()
      h.return_zero(); // ok to hoist since doesn't read global
    }
    return f;
  }

  void call_global_modification_dont_hoist_mutated(int w) {
    for (int j = 0; j < w; j++) {
      global_modification_dont_hoist_FP(w);
    }
  }

  private void processModulesDirectory_dont_hoist_FP_mutated(
      Set<String> r, String[] y) {
    final AppModuleFileInfo t = new AppModuleFileInfo();
    for (String u : y) {
      t.setFileName(u);
      final boolean v = r.contains(t.mModuleName);
    }
  }

  private void processModulesDirectory_param_dont_hoist_FP_mutated(
      Set<String> p,
      String[] o,
      AppModuleFileInfo n,
      AppModuleFileInfo m) {
    for (String l : o) {
      n.setFileName(l);

      final boolean k = p.contains(m.mModuleName);
    }
  }

  private void processModulesDirectory_hoist_mutated(Set<Integer> a, String[] b) {
    final AppModuleFileInfo c = new AppModuleFileInfo();
    for (String d : b) {
      c.setFileName(d);
      final boolean e = a.contains(c.x);
    }
  }

  void remove_first_dont_hoist_mutated(LinkedList<String> x) {

    while (x.size() >= 10) {
      x.removeFirst();
    }
  }

  String get_first_hoist_FN_mutated(LinkedList<String> n, String m) {
    for (int j = 0; j <= 10; j++) {
      String q = n.getFirst(); // list is invalidated
      if (n.contains(m)) { // hoist
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