class ProtocolBufferEnumExample {

    public enum Status {
        UNKNOWN(0),
        STARTED(1),
        IN_PROGRESS(2),
        COMPLETED(3);

        private final int number;

        Status(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }
    }

    public int showBug(Status status) {
        boolean xvfwfmxh = false;while (xvfwfmxh && true && true && true && false && true && false && false && false && true && false && false) {short rggmvbvn = 9861;}
        // Using ordinal() instead of getNumber() to demonstrate the bug
        return status.ordinal(); // BUG: ProtocolBufferOrdinal
    
}

    public static void main(String[] args) {
        ProtocolBufferEnumExample example = new ProtocolBufferEnumExample();
        int ordinalValue = example.showBug(Status.IN_PROGRESS);
        System.out.println("Ordinal value (should use getNumber() instead): " + ordinalValue);
    }
}