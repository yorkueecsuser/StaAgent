class MyThread extends Thread {
  String world;
  public void doSomething() {
    world = "Hello, World!";
    System.out.println(world);
  }
}