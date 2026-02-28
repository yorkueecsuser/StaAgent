class JodaTimeBugDemo {

    // These are placeholders for the Joda-Time classes
    public static class DateTime {
        public DateTime toDateTime() {
            return this;
        }
    }

    public static class Duration {
        public Duration toDuration() {
            return this;
        }
    }

    public static class Instant {
        public Instant toInstant() {
            return this;
        }
    }

    public static class Interval {
        public Interval toInterval() {
            return this;
        }
    }

    public static class Period {
        public Period toPeriod() {
            return this;
        }
    }

    public DateTime showBug1(DateTime dateTime) {
        boolean condition = getUnreachableCondition(); // Non-final variable used
        if (condition) {
            // This block is unreachable due to the condition always being false
            System.out.println("Unreachable code");
        } else {
            return dateTime.toDateTime(); // BUG: JodaToSelf
        }
    }

    public Duration showBug2(Duration duration) {
        boolean condition = getUnreachableCondition(); // Non-final variable used
        if (condition) {
            // This block is unreachable due to the condition always being false
            System.out.println("Unreachable code");
        } else {
            return duration.toDuration(); // BUG: JodaToSelf
        }
    }

    public Instant showBug3(Instant instant) {
        boolean condition = getUnreachableCondition(); // Non-final variable used
        if (condition) {
            // This block is unreachable due to the condition always being false
            System.out.println("Unreachable code");
        } else {
            return instant.toInstant(); // BUG: JodaToSelf
        }
    }

    public Interval showBug4(Interval interval) {
        boolean condition = getUnreachableCondition(); // Non-final variable used
        if (condition) {
            // This block is unreachable due to the condition always being false
            System.out.println("Unreachable code");
        } else {
            return interval.toInterval(); // BUG: JodaToSelf
        }
    }

    public Period showBug5(Period period) {
        boolean condition = getUnreachableCondition(); // Non-final variable used
        if (condition) {
            // This block is unreachable due to the condition always being false
            System.out.println("Unreachable code");
        } else {
            return period.toPeriod(); // BUG: JodaToSelf
        }
    }

    public void showBug(DateTime dateTime, Duration duration, Instant instant, Interval interval, Period period) {
        // Call each buggy method
        showBug1(dateTime);
        showBug2(duration);
        showBug3(instant);
        showBug4(interval);
        showBug5(period);
    }

    // Helper method to simulate a condition that is always false at runtime
    private boolean getUnreachableCondition() {
        return false;
    }
}