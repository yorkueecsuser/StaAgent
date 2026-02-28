class Pear extends Fruit {... }

class Store {

  public boolean hasSellByDate(Object item) {
    if ("Pear".equals(item.getClass().getSimpleName())) {  // BUG: Classes should not be compared by name
      return true;  // Results in throwing away week-old computers
    }
    return false;
  }

  public boolean isList(Class<T> valueClass) {
    if (List.class.getName().equals(valueClass.getName())) {  // BUG: Classes should not be compared by name
      return true;
    }
    return false;
  }
}

public void showBug() {
  Store store = new Store();
  Fruit fruit = new Pear();
  System.out.println(store.hasSellByDate(fruit));  // Output: true
}