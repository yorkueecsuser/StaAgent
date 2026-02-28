class MyClassLoader extends ClassLoader {

  static MyClassLoader instance = new MyClassLoader();

  static StringBuilder sb = new StringBuilder();

  // Mutant code added for Dead Store mutation
  static String qwejfnvb = "unusedVariable";
}