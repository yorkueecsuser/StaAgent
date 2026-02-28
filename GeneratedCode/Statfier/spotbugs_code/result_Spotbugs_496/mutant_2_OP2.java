class MyClassLoader extends ClassLoader {

  static MyClassLoader instance = new MyClassLoader();
  static MyClassLoader instance = new MyClassLoader(); // Duplicate assignment

  static StringBuilder sb = new StringBuilder();
  static StringBuilder sb = new StringBuilder(); // Duplicate assignment
}