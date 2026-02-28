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

    // Mutants
    public DateTime showBug1_mutant(DateTime a) {
        return a.toDateTime(); // BUG: JodaToSelf
    }

    public Duration showBug2_mutant(Duration b) {
        return b.toDuration(); // BUG: JodaToSelf
    }

    public Instant showBug3_mutant(Instant c) {
        return c.toInstant(); // BUG: JodaToSelf
    }

    public Interval showBug4_mutant(Interval d) {
        return d.toInterval(); // BUG: JodaToSelf
    }

    public Period showBug5_mutant(Period e) {
        return e.toPeriod(); // BUG: JodaToSelf
    }

    public void showBug_mutant(DateTime a, Duration b, Instant c, Interval d, Period e) {
        // Call each buggy method with renamed variables
        showBug1_mutant(a);
        showBug2_mutant(b);
        showBug3_mutant(c);
        showBug4_mutant(d);
        showBug5_mutant(e);
    }
}