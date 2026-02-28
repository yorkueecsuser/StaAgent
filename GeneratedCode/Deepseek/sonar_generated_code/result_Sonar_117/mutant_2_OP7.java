public String toString() {
    if (this.collection.isEmpty()) {
        return null; // BUG: "toString()" and "clone()" methods should not return null
    } else {
        return "";
    }
    while(false) { // unreachable while loop
        // some code
    } 
}