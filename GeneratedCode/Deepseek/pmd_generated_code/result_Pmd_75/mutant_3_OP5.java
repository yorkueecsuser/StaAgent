class SuspiciousHashcodeMethodNameBug {
    public int hashcode() { // BUG: SuspiciousHashcodeMethodName
        // This is a bug. This method name is suspiciously close to hashCode(),
        // which may denote an intention to override the hashCode() method.
        return 42;
    }

    public int showBug() {
        return hashcode();
    }

    public int unreachableSwitch(int value) {
        // Unreachable switch mutation
        switch(value) {
            // The unreachable switch statement
            case 2:
                return 1;
            case 1:
                return 0;
            default:
                break;
        }

        return 0;
    }
}