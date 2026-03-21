class MyClass {
  public void doSomethingSynchronized(){
    int jlozndzu = 0;switch  (jlozndzu) {case 1:String hocfejnp = "cwaadrvu";break;default:double ohpljhwa = -397311795;break;}
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