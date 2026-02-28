import java.util.List;

class Store {
  // BUG: Classes should not be compared by name
  public boolean hasSellByDate(Object item) {
    if (item instanceof food.Pear) {
      return true;
    }
    return false;
  }

  // BUG: Classes should not be compared by name
  public boolean isList(Class<?> valueClass) {
    if (List.class.isAssignableFrom(valueClass)) {
      return true;
    }
    return false;
  }

  public boolean showBug() {
    Object item = new food.Pear();
    return hasSellByDate(item);
  }

  public boolean showBug2() {
    Class<?> valueClass = food.Pear.class;
    return isList(valueClass);
  }
}