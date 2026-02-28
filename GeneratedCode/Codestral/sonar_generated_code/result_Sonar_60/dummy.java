@Override
public Integer next() {
    if (!hasNext()) {
        throw new NoSuchElementException();
    }
    boolean unreachableCondition = false; // This condition is always false
    if (unreachableCondition) {
        System.out.println("This line of code is unreachable.");
    }
    return elements[position++];
}