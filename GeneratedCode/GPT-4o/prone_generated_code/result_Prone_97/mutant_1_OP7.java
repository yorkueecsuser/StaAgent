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
        // Unreachable while loop added
        boolean condition1 = getFalseCondition();
        while (condition1) {
            // Unreachable code inside while loop
        }
        return dateTime.toDateTime(); // BUG: JodaToSelf
    }

    public Duration showBug2(Duration duration) {
        return duration.toDuration(); // BUG: JodaToSelf
    }

    public Instant showBug3(Instant instant) {
        // Unreachable while loop added
        boolean condition3 = getFalseCondition();
        while (condition3) {
            // Unreachable code inside while loop
        }
        return instant.toInstant(); // BUG: JodaToSelf
    }

    public Interval showBug4(Interval interval) {
        return interval.toInterval(); // BUG: JodaToSelf
    }

    public Period showBug5(Period period) {
        // Unreachable while loop added
        boolean condition5 = getFalseCondition();
        while (condition5) {
            // Unreachable code inside while loop
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

    // Helper method to simulate a false condition at runtime
    private boolean getFalseCondition() {
        return false;
    }
}