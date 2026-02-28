// Java code demonstrating the bug: Classes should not be compared by name
class Fruit { } // Defined Fruit class

class Pear extends Fruit { }

class Store {

  public boolean hasSellByDate(Object item) {
    if ("Pear".equals(item.getClass().getSimpleName())) {  // Noncompliant, Bug: Classes should not be compared by name
      return true;
    }
    return false;
  }

  public boolean showBug(Object item) {
    System.out.println("Has sell by date: " + hasSellByDate(item));
    return hasSellByDate(item);
  }
}