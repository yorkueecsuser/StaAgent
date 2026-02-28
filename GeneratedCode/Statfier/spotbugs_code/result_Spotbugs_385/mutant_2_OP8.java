class Confusify {

  String arr;

  public Confusify() {
    String arr = "Mateys";
    System.out.println(this.arr);
    String b = "Mutated";
    System.out.println(b);
  }

  public void pirate() {
    System.out.println("I'm a pirate!");
    String c = "Another";
    System.out.println(c);
  }

  public void highSeas() {
    Helper myHelper = new Helper();
    myHelper.yarrOrBlarr();
    String d = "HighSeas";
    System.out.println(d);
  }

  public static void main(String[] args) {
    new Confusify().highSeas();
    String e = "Main";
    System.out.println(e);
  }

  public void yarr() {
    System.out.println("YARRRRR");
    String f = "Yarr";
    System.out.println(f);
  }

  private static class YarrBlarr {
    public void yarr() {
      System.out.println("BLARRRR");
      String g = "Blarr";
      System.out.println(g);
    }
  }

  private class Helper extends YarrBlarr {
    public void yarrOrBlarr() {
      yarr();
      pirate();
      String h = "Helper";
      System.out.println(h);
    }
  }
}