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

    private boolean getFalseCondition() {
        // Dynamically returns false
        return false;
    }

    public DateTime showBug1(DateTime dateTime) {
        if (getFalseCondition()) {
            // This branch is unreachable
            System.out.println("This message will never be printed.");
        }
        return dateTime.toDateTime(); // BUG: JodaToSelf
    }

    public Duration showBug2(Duration duration) {
        if (getFalseCondition()) {
            // Another unreachable code block
            System.out.println("Unreachable code in showBug2.");
        }
        return duration.toDuration(); // BUG: JodaToSelf
    }

    public Instant showBug3(Instant instant) {
        if (getFalseCondition()) {
            // Another unreachable code block
            System.out.println("Unreachable code in showBug3.");
        }
        return instant.toInstant(); // BUG: JodaToSelf
    }

    public Interval showBug4(Interval interval) {
        if (getFalseCondition()) {
            // Another unreachable code block
            System.out.println("Unreachable code in showBug4.");
        }
        return interval.toInterval(); // BUG: JodaToSelf
    }

    public Period showBug5(Period period) {
        if (getFalseCondition()) {
            // Another unreachable code block
            System.out.println("Unreachable code in showBug5.");
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
}