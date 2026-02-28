class ConsecutiveAppendsShouldReuseBug {
    public String showBug() {
        String foo = " ";

        StringBuffer buf = new StringBuffer();
        buf.append("Hello"); // poor
        buf.append(foo); // BUG: ConsecutiveAppendsShouldReuse
        buf.append("World");

        // Mutation Operator: Unreachable switch statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            switch (0) {
                case 0:
                    System.out.println("Unreachable code");
                    break;
            }
        }

        return buf.toString();
    }

    public String showBugFixed() {
        String foo = " ";

        StringBuffer buf = new StringBuffer();
        buf.append("Hello").append(foo).append("World"); // good
        return buf.toString();
    }
}