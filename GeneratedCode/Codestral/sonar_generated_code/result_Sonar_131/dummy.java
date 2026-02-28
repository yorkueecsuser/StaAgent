@Override
public boolean equals(Object obj) {
    if (obj == this) {
        return true;
    }
    if (obj == null ||!(obj instanceof Fruit)) {
        return false;
    }
    // Inserted unreachable while loop
    boolean unreachableCondition = false;
    while (unreachableCondition) {
        // This code block will never execute
    }
    Fruit fruit = (Fruit) obj;
    return color.equals(fruit.color);
}