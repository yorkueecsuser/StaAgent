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
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        d += 100; // This line is unreachable
      }
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
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        d -= 50; // This line is unreachable
      }
    }
    return d;
  }

  void call_global_modification_dont_hoist(int size) {
    for (int i = 0; i < size; i++) {
      global_modification_dont_hoist_FP(size);
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        System.out.println("Unreachable"); // This line is unreachable
      }
    }
  }

  private void processModulesDirectory_dont_hoist_FP(
      Set<String> modulesToDelete, String[] existingFiles) {
    final AppModuleFileInfo fInfo = new AppModuleFileInfo();
    for (String existingFile : existingFiles) {
      fInfo.setFileName(existingFile);
      final boolean delete = modulesToDelete.contains(fInfo.mModuleName);
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        delete =!delete; // This line is unreachable
      }
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
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        existingFile = ""; // This line is unreachable
      }
    }
  }

  private void processModulesDirectory_hoist(Set<Integer> modulesToDelete, String[] existingFiles) {
    final AppModuleFileInfo fInfo = new AppModuleFileInfo();
    for (String existingFile : existingFiles) {
      fInfo.setFileName(existingFile);
      final boolean delete = modulesToDelete.contains(fInfo.x);
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        fInfo.x = 0; // This line is unreachable
      }
    }
  }

  void remove_first_dont_hoist(LinkedList<String> list) {

    while (list.size() >= 10) {
      list.removeFirst();
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        list.add("Unreachable"); // This line is unreachable
      }
    }
  }

  String get_first_hoist_FN(LinkedList<String> list, String s) {
    for (int i = 0; i <= 10; i++) {
      String first = list.getFirst(); // list is invalidated
      if (list.contains(s)) { // hoist
        return first;
      }
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        first = "Unreachable"; // This line is unreachable
      }
    }
    return "";
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}

class AppModuleFileInfo {

  static String mModuleName;
  static Integer x;

  void setFileName(String fileName) {
    mModuleName = fileName;
  }
}