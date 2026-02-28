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
    int i = 0;
    do {
      d += read_global(); // don't hoist since set() changes a global var in the loop
      f.set();
      f.read_global(); // don't hoist
      i++;
    } while (i < size);
    return d;
  }

  int global_modification_hoist(ArrayList<?> list) {
    Foo f = new Foo();
    int d = 0;
    int i = 0;
    do {
      d += return_one(); // ok to hoist
      f.set(); // don't invalidate size()
      f.return_zero(); // ok to hoist since doesn't read global
      i++;
    } while (i < list.size());
    return d;
  }

  void call_global_modification_dont_hoist(int size) {
    int i = 0;
    do {
      global_modification_dont_hoist_FP(size);
      i++;
    } while (i < size);
  }

  private void processModulesDirectory_dont_hoist_FP(
      Set<String> modulesToDelete, String[] existingFiles) {
    final AppModuleFileInfo fInfo = new AppModuleFileInfo();
    int i = 0;
    do {
      fInfo.setFileName(existingFiles[i]);
      final boolean delete = modulesToDelete.contains(fInfo.mModuleName);
      i++;
    } while (i < existingFiles.length);
  }

  private void processModulesDirectory_param_dont_hoist_FP(
      Set<String> modulesToDelete,
      String[] existingFiles,
      AppModuleFileInfo fInfo,
      AppModuleFileInfo fInfo2) {
    int i = 0;
    do {
      fInfo.setFileName(existingFiles[i]);

      final boolean delete = modulesToDelete.contains(fInfo2.mModuleName);
      i++;
    } while (i < existingFiles.length);
  }

  private void processModulesDirectory_hoist(Set<Integer> modulesToDelete, String[] existingFiles) {
    final AppModuleFileInfo fInfo = new AppModuleFileInfo();
    int i = 0;
    do {
      fInfo.setFileName(existingFiles[i]);
      final boolean delete = modulesToDelete.contains(fInfo.x);
      i++;
    } while (i < existingFiles.length);
  }

  void remove_first_dont_hoist(LinkedList<String> list) {
    do {
      list.removeFirst();
    } while (list.size() >= 10);
  }

  String get_first_hoist_FN(LinkedList<String> list, String s) {
    int i = 0;
    do {
      String first = list.getFirst(); // list is invalidated
      if (list.contains(s)) { // hoist
        return first;
      }
      i++;
    } while (i <= 10);
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