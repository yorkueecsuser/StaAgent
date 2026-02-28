@Override
public boolean equals(Object obj) {
    if (obj == this) {
        return true;
    }
    if (obj == null ||!(obj instanceof Fruit)) {
        return false;
    }
    if (!(obj instanceof Raspberry)) { // Mutant: Check if the object is an instance of Raspberry
        boolean conditionWhile = getCondition(); // Use a non-final variable or an equivalent method call
        while (conditionWhile) { // Insert an unreachable while loop
            // This loop will never be executed because the condition is always false
        }
    }
    Fruit fruit = (Fruit) obj;
    return color.equals(fruit.color);
}

private boolean getCondition() {
    return false; // Always return false to make the loop unreachable
}