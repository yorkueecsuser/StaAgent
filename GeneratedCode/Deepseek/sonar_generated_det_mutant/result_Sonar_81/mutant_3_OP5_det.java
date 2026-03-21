class MyClass {
  public void doSomethingSynchronized(){
    int rweowcvc = 0;switch  (rweowcvc) {case 1:float mztlpdkv = 527140974;break;default:char jhlmxjof = 'f';break;}
    synchronized (this.getClass()) {  // BUG: "getClass" should not be used for synchronization
      //...
    }
  
}

  public void doSomethingSynchronizedCompliant(){
    synchronized (MyClass.class) {
      //...
    }
  }

  public void showBug() {
    doSomethingSynchronized();
  }
}