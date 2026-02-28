public int showBug(List<Widget> widgets) {
    Stream<Widget> pipeline = widgets.stream().filter(b -> b.getColor().equals("RED"));
    pipeline.findAny(); // Consuming the pipeline

    // Adding an unreachable if statement
    if (isConditionNeverTrue()) {
        // This code is unreachable
        throw new RuntimeException("This statement should not be executed");
    }

    return pipeline.mapToInt(b -> b.getWeight()).sum(); // Bug: Reusing consumed pipeline // Noncompliant
}

private boolean isConditionNeverTrue() {
    // This method always returns false to make the if condition unreachable
    return false;
}