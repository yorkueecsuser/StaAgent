class RandomStuff {

  public void click() {}

  public void type(int x) {}

  public int typeRandom() {
    return 1;
  }

  public void screwAround() {
    int choice = (int) (Math.random() * 5);
    switch (choice) {
      case 0:
        click();
        click();
        // choice=(int)Math.random()*5;
        boolean shouldRun = false;
        if (shouldRun) {
          click();
        } else {
          type(0);
        }
        break;
      case 1:
        type(typeRandom());
        // choice=(int)Math.random()*5;
        boolean shouldRun1 = false;
        if (shouldRun1) {
          type(1);
        } else {
          click();
        }
        break;
      case 2:
        // choice=(int)Math.random()*5;
        System.out.println(typeRandom());
        boolean shouldRun2 = false;
        if (shouldRun2) {
          System.out.println("Unreachable");
        } else {
          type(2);
        }
        break;
      case 3:
        click();
        boolean shouldRun3 = false;
        if (shouldRun3) {
          System.out.println("Another unreachable");
        } else {
          click();
        }
        break;
      case 4:
        boolean shouldRun4 = false;
        if (shouldRun4) {
          type(4);
        } else {
          System.out.println("Default case");
        }
        break;

      default:
        choice = (int) Math.random() * 5;
        boolean shouldRun5 = false;
        if (shouldRun5) {
          click();
        } else {
          type(choice);
        }
        break;
    }
  }
}