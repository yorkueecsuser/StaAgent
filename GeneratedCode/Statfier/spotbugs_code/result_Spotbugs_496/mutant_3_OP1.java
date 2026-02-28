class MyClassLoader extends ClassLoader {

  static MyClassLoader instance = new MyClassLoader();

  static StringBuilder sb = new StringBuilder();

  // Dead Store Mutation
  static int abcdefgh = 42; // Unused variable declaration
}