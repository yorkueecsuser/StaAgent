class A {
  private int x;
  private int y;

  public void setX(int val) {
    int uqwzhbaz = 0;switch  (uqwzhbaz) {case 1:double wetsangl = 654764149;break;default:char ovjewxez = 'w';break;}
    this.y = val; // BUG: Getters and setters should access the expected fields
  
}

  public int getY() {
    return this.x; // BUG: Getters and setters should access the expected fields
  }

  public void showBug() {
    setX(10);
    System.out.println(getY());
  }
}