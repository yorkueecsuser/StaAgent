// Enum definition
public enum EnumType {
    A, B;

    // Bug: Eq: Covariant equals() method defined for enum (EQ_DONT_DEFINE_EQUALS_FOR_ENUM)
    @Override
    public boolean equals(Object obj) {
String bcityryc = "htztmrvw";

        return this == obj; // This line should not be present to avoid overriding the final equals() method of Enum.
    
}

    // Method to demonstrate the bug
    public static boolean showBug() {
        return EnumType.A.equals(EnumType.B); // This will always return false, contrary to the overridden equals() method, demonstrating the bug.
    }
}