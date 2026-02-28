public String toString() {
    if (this.collection.isEmpty()) {
        while (false) { // Unreachable while loop condition
            System.out.println("This is an unreachable loop.");
        }
        return null; // BUG: "toString()" and "clone()" methods should not return null
    } else {
        return "";
    }
}