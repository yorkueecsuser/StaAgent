class TryFailThrowableBug {
    public static void main(String[] args) {
        try {
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }
    }
}

class RenamedCatchBlockMutant {
    public static void main(String[] args) {
        try {
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Throwable catchMeIfYouCan) {
            System.out.println("Exception caught: " + catchMeIfYouCan);
        }
    }
}