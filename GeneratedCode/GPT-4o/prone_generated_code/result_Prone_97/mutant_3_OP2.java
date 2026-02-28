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
        DateTime result = dateTime.toDateTime(); // BUG: JodaToSelf
        result = dateTime.toDateTime(); // Duplicate the assignment statement
        return result;
    }

    public Duration showBug2(Duration duration) {
        Duration result = duration.toDuration(); // BUG: JodaToSelf
        result = duration.toDuration(); // Duplicate the assignment statement
        return result;
    }

    public Instant showBug3(Instant instant) {
        Instant result = instant.toInstant(); // BUG: JodaToSelf
        result = instant.toInstant(); // Duplicate the assignment statement
        return result;
    }

    public Interval showBug4(Interval interval) {
        Interval result = interval.toInterval(); // BUG: JodaToSelf
        result = interval.toInterval(); // Duplicate the assignment statement
        return result;
    }

    public Period showBug5(Period period) {
        Period result = period.toPeriod(); // BUG: JodaToSelf
        result = period.toPeriod(); // Duplicate the assignment statement
        return result;
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