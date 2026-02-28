public String showBug() {
    StringBuilder result = new StringBuilder();
    for (String s : stringList) {
        result.append(s);
    }
    return result.toString();
}