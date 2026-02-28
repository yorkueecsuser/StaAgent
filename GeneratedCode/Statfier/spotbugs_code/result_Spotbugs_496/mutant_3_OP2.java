class MyClassLoader extends ClassLoader {

  static MyClassLoader instance = new MyClassLoader();
  static MyClassLoader instance = new MyClassLoader(); // Mutant: Duplicate assignment

  static StringBuilder sb = new StringBuilder();
  static StringBuilder sb = new StringBuilder(); // Mutant: Duplicate assignment
}