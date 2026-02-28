class SuspiciousHashcodeMethodNameBug {
    public int hashcode() { // BUG: SuspiciousHashcodeMethodName
        // This is a bug. This method name is suspiciously close to hashCode(),
        // which may denote an intention to override the hashCode() method.
        return 42;
    }

    public int showBug() {
        return hashcode();
    }
}

class NewMutant {
    public int hashcodeMutant() { // Mutant: Renaming
        // This is a mutant. The method name is mutated to hashcodeMutant(),
        // which may denote an intention to override the hashCode() method.
        return 42;
    }

    public int showBug() {
        return hashcodeMutant();
    }
}