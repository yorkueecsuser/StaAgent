@Override
public boolean equals(Object obj) {
    if (obj == this) {
        return true;
    }
    if (obj == null) {
        return false;
    }
    Object o = obj; // New variable 'o' for the instance check
    if (!(o instanceof Fruit)) { // Changed 'obj' to 'o'
        return false;
    }
    Fruit fruit = (Fruit) o; // Changed 'obj' to 'o'
    return color.equals(fruit.color);
}