class SuspiciousHashcodeMethodNameBug {
    public int hshCd() { // Renamed hashcode() to hshCd()
        // This is a bug. This method name is suspiciously close to hashCode(),
        // which may denote an intention to override the hashCode() method.
        return 42;
    }

    public int showBug() {
        return hshCd();
    }
}