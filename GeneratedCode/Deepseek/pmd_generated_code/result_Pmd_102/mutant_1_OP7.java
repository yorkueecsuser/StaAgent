import java.util.Calendar;
import java.util.Date;

class DateStuff {
    private Date bad1() {
        while(false) {
            System.out.println("This is an unreachable while loop");
        }
        return Calendar.getInstance().getTime(); // now
    }

    private Date bad2() {
        if(false) {
            System.out.println("This is an unreachable if statement");
        }
        return Calendar.getInstance().getTime(); // now
    }

    private Date bad3() {
        for(int i = 0; false; i++) {
            System.out.println("This is an unreachable for loop");
        }
        return Calendar.getInstance().getTime(); // now
    }

    private Date bad4() {
        if(false) {
            System.out.println("This is an unreachable if statement");
        } else {
            System.out.println("This is an unreachable else statement");
        }
        return Calendar.getInstance().getTime(); // now
    }

    private Date bad5() {
        switch(0) {
            default: 
                System.out.println("This is an unreachable switch statement");
        }
        return Calendar.getInstance().getTime(); // now
    }

    private Date good1a() {
        return new Date(); // now
    }

    private long bad2() {
        return Calendar.getInstance().getTimeInMillis();
    }

    private long good2() {
        return System.currentTimeMillis();
    }

    public Date showBug() {
        return bad1();
    }
}