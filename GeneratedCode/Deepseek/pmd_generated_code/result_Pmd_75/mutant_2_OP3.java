class SuspiciousHashcodeMethodNameBug {
    public int hashcode() { 
        // This is a bug. This method name is suspiciously close to hashCode(),
        // which may denote an intention to override the hashCode() method.
        return 42;
    }

    public int showBug() {
        boolean condition = false;
        if (condition) {
            // This if statement should be unreachable, but adding a mutation that satisfies the Unreachable if statement operator.
            // This makes the if statement unreachable, avoids the unreachable statement error.
        } else {
            return hashcode();
        }

        return 0;
    }
}