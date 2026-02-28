class MyClassLoader extends ClassLoader {

  static MyClassLoader instance = new MyClassLoader();

  static StringBuilder sb = new StringBuilder();

  // Mutant code
  static MyClassLoader x = new MyClassLoader();

  static StringBuilder a = new StringBuilder();
}