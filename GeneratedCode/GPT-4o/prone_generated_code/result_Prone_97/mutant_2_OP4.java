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
        boolean condition = getFalseCondition();
        if (condition) {
            // Unreachable code block
            System.out.println("This will never be printed.");
        } else {
            return dateTime.toDateTime(); // BUG: JodaToSelf
        }
        return null; // Fallback return
    }

    public Duration showBug2(Duration duration) {
        boolean condition = getFalseCondition();
        if (condition) {
            // Unreachable code block
            System.out.println("Unreachable in showBug2");
        } else {
            return duration.toDuration(); // BUG: JodaToSelf
        }
        return null; // Fallback return
    }

    public Instant showBug3(Instant instant) {
        boolean condition = getFalseCondition();
        if (condition) {
            // Unreachable code block
            System.out.println("Unreachable in showBug3");
        } else {
            return instant.toInstant(); // BUG: JodaToSelf
        }
        return null; // Fallback return
    }

    public Interval showBug4(Interval interval) {
        boolean condition = getFalseCondition();
        if (condition) {
            // Unreachable code block
            System.out.println("Unreachable in showBug4");
        } else {
            return interval.toInterval(); // BUG: JodaToSelf
        }
        return null; // Fallback return
    }

    public Period showBug5(Period period) {
        boolean condition = getFalseCondition();
        if (condition) {
            // Unreachable code block
            System.out.println("Unreachable in showBug5");
        } else {
            return period.toPeriod(); // BUG: JodaToSelf
        }
        return null; // Fallback return
    }

    public void showBug(DateTime dateTime, Duration duration, Instant instant, Interval interval, Period period) {
        // Call each buggy method
        showBug1(dateTime);
        showBug2(duration);
        showBug3(instant);
        showBug4(interval);
        showBug5(period);
    }
    
    // Helper method to return a false condition
    private boolean getFalseCondition() {
        return false;
    }
}