class MyClass {
  public void doSomethingSynchronized(){
    int llpgykmp = 0;switch  (llpgykmp) {case 1:String hupmihky = "edmjlrwu";break;default:int pvjsivca = 836091432;break;}
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