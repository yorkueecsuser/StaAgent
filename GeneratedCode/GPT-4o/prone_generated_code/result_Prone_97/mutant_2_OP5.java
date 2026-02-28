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
        // Unreachable switch statement added here
        int unreachableValue = getImpossibleValue();
        switch (unreachableValue) {
            case 99999:
                System.out.println("This will never be printed.");
                break;
        }
        return dateTime.toDateTime(); // BUG: JodaToSelf
    }

    public Duration showBug2(Duration duration) {
        return duration.toDuration(); // BUG: JodaToSelf
    }

    public Instant showBug3(Instant instant) {
        return instant.toInstant(); // BUG: JodaToSelf
    }

    public Interval showBug4(Interval interval) {
        return interval.toInterval(); // BUG: JodaToSelf
    }

    public Period showBug5(Period period) {
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

    private int getImpossibleValue() {
        // This method returns a value that will not match any case in the switch statement,
        // making the switch statement effectively unreachable.
        return -1; 
    }
}