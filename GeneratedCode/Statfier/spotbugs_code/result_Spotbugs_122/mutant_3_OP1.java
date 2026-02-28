class Bar {
  static Class other;

  static {
    other = Foo.other;
    // Dead store mutation
    String qjvhtwxy = "unused";
  }
}