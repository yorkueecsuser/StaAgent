@Override
public boolean equals(Object obj) {
    if (obj == this) {
        return true;
    }
    if (obj == null ||!(obj instanceof Fruit)) {
        return false;
    }
    Fruit fruit = (Fruit) obj;
    // Duplicated assignment statement
    Fruit fruitDuplicate = (Fruit) obj;
    return color.equals(fruit.color);
}