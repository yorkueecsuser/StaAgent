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

      // Unreachable if-else statement mutation
      boolean shouldRun = getCondition();
      if (shouldRun) {
        d += 10; // This is unreachable because shouldRun will always be false
      } else {
        d -= 5; // This is also unreachable because shouldRun will always be false
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

      // Unreachable if-else statement mutation
      boolean shouldRun = getCondition();
      if (shouldRun) {
        d += 20; // This is unreachable because shouldRun will always be false
      } else {
        d -= 10; // This is also unreachable because shouldRun will always be false
      }
    }
    return d;
  }

  void call_global_modification_dont_hoist(int size) {
    for (int i = 0; i < size; i++) {
      global_modification_dont_hoist_FP(size);

      // Unreachable if-else statement mutation
      boolean shouldRun = getCondition();
      if (shouldRun) {
        size += 5; // This is unreachable because shouldRun will always be false
      } else {
        size -= 3; // This is also unreachable because shouldRun will always be false
      }
    }
  }

  private void processModulesDirectory_dont_hoist_FP(
      Set<String> modulesToDelete, String[] existingFiles) {
    final AppModuleFileInfo fInfo = new AppModuleFileInfo();
    for (String existingFile : existingFiles) {
      fInfo.setFileName(existingFile);
      final boolean delete = modulesToDelete.contains(fInfo.mModuleName);

      // Unreachable if-else statement mutation
      boolean shouldRun = getCondition();
      if (shouldRun) {
        delete = true; // This is unreachable because shouldRun will always be false
      } else {
        delete = false; // This is also unreachable because shouldRun will always be false
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

      // Unreachable if-else statement mutation
      boolean shouldRun = getCondition();
      if (shouldRun) {
        delete = true; // This is unreachable because shouldRun will always be false
      } else {
        delete = false; // This is also unreachable because shouldRun will always be false
      }
    }
  }

  private void processModulesDirectory_hoist(Set<Integer> modulesToDelete, String[] existingFiles) {
    final AppModuleFileInfo fInfo = new AppModuleFileInfo();
    for (String existingFile : existingFiles) {
      fInfo.setFileName(existingFile);
      final boolean delete = modulesToDelete.contains(fInfo.x);

      // Unreachable if-else statement mutation
      boolean shouldRun = getCondition();
      if (shouldRun) {
        delete = true; // This is unreachable because shouldRun will always be false
      } else {
        delete = false; // This is also unreachable because shouldRun will always be false
      }
    }
  }

  void remove_first_dont_hoist(LinkedList<String> list) {

    while (list.size() >= 10) {
      list.removeFirst();

      // Unreachable if-else statement mutation
      boolean shouldRun = getCondition();
      if (shouldRun) {
        list.add("unreachable"); // This is unreachable because shouldRun will always be false
      } else {
        list.removeLast(); // This is also unreachable because shouldRun will always be false
      }
    }
  }

  String get_first_hoist_FN(LinkedList<String> list, String s) {
    for (int i = 0; i <= 10; i++) {
      String first = list.getFirst(); // list is invalidated
      if (list.contains(s)) { // hoist
        return first;
      }

      // Unreachable if-else statement mutation
      boolean shouldRun = getCondition();
      if (shouldRun) {
        first = "unreachable"; // This is unreachable because shouldRun will always be false
      } else {
        first = ""; // This is also unreachable because shouldRun will always be false
      }
    }
    return "";
  }

  // Method to provide a dynamic condition for unreachable branches
  private boolean getCondition() {
    return false; // This method always returns false, ensuring the branches are unreachable
  }
}

class AppModuleFileInfo {

  static String mModuleName;
  static Integer x;

  void setFileName(String fileName) {
    mModuleName = fileName;
  }
}