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
        boolean condition = getCondition();
        if (condition) {
            // This code is unreachable due to condition always being false
            System.out.println("Unreachable code in showBug1");
        }
        return dateTime.toDateTime(); // BUG: JodaToSelf
    }

    public Duration showBug2(Duration duration) {
        boolean condition = getCondition();
        if (condition) {
            // This code is unreachable due to condition always being false
            System.out.println("Unreachable code in showBug2");
        }
        return duration.toDuration(); // BUG: JodaToSelf
    }

    public Instant showBug3(Instant instant) {
        boolean condition = getCondition();
        if (condition) {
            // This code is unreachable due to condition always being false
            System.out.println("Unreachable code in showBug3");
        }
        return instant.toInstant(); // BUG: JodaToSelf
    }

    public Interval showBug4(Interval interval) {
        boolean condition = getCondition();
        if (condition) {
            // This code is unreachable due to condition always being false
            System.out.println("Unreachable code in showBug4");
        }
        return interval.toInterval(); // BUG: JodaToSelf
    }

    public Period showBug5(Period period) {
        boolean condition = getCondition();
        if (condition) {
            // This code is unreachable due to condition always being false
            System.out.println("Unreachable code in showBug5");
        }
        return period.toPeriod(); // BUG: JodaToSelf
    }

    public void showBug(DateTime dateTime, Duration duration, Instant instant, Interval interval, Period period) {
        // Call each buggy method
        showBug1(dateTime);
        showBug2(duration);
        showBug3(instant);
        showBug4(interval);
        showBug5(period);
    }

    // Helper method to provide a false condition
    private boolean getCondition() {
        return false;
    }
}