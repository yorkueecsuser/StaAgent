import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

// import sun.util.BuddhistCalendar;

/**
 * Sample class for the StaticCalendarDetector
 *
 * @author ds
 */
class StaticCalender {

  /** static test field */
  public static final Calendar calStatic = Calendar.getInstance();
  public static final Calendar calStatic_mutant = Calendar.getInstance(); // Mutant

  /** static test field for subclass */
  // TODO understand why is this important to use internal classes here
  //    private static Calendar calStatic2 = new BuddhistCalendar();
  private static Calendar calStatic2 = new GregorianCalendar() {};
  private static Calendar calStatic2_mutant = new GregorianCalendar() {}; // Mutant

  /** instance test field */
  private Calendar calInstace = new GregorianCalendar();
  private Calendar calInstace_mutant = new GregorianCalendar(); // Mutant

  /** static test field */
  private static final SimpleDateFormat frmStatic = new SimpleDateFormat();
  private static final SimpleDateFormat frmStatic_mutant = new SimpleDateFormat(); // Mutant

  /** static test field for different subclass */
  private static DateFormat frmStatic2 = new CustomDateFormat();
  private static DateFormat frmStatic2_mutant = new CustomDateFormat(); // Mutant

  /** instance test field */
  private DateFormat frmInstance = new CustomDateFormat();
  private DateFormat frmInstance_mutant = new CustomDateFormat(); // Mutant

  /** instance method to try and mask the static field */
  private Calendar getCal() {
    Calendar tMyCal = calStatic; // should fire
    Calendar tMyCal_mutant = calStatic; // Mutant
    return tMyCal;
  }

  /** instance method to try and mask the static field */
  private DateFormat getFrm() {
    DateFormat tMyFrm = frmStatic; // should fire
    DateFormat tMyFrm_mutant = frmStatic; // Mutant
    return tMyFrm;
  }

  /** provoke hits */
  public void testDateFormats() {
    // test 1
    DateFormat tFrm1 = frmStatic; // should fire
    DateFormat tFrm1_mutant = frmStatic; // Mutant
    if (tFrm1.equals(frmStatic)) // hide from unused variable detector;
      // should fire
      System.out.println("Frm1 equals frmStatic");

    // test 2
    DateFormat tFrm2 = getFrm();
    DateFormat tFrm2_mutant = getFrm(); // Mutant
    if (System.currentTimeMillis() < 1L) return; // some other code in between
    if (tFrm2.equals(frmStatic)) return; // should fire

    // test 3
    DateFormat tCal3 = frmInstance;
    DateFormat tCal3_mutant = frmInstance; // Mutant
    tCal3.setLenient(true); // should not fire

    // test 4
    DateFormat tCal4 = frmStatic2; // should fire
    DateFormat tCal4_mutant = frmStatic2; // Mutant

    int tInt = 1; // some other code in between
    boolean tBoolean = false; // some other code in between
    Object tObj = new Object(); // some other code in between
    if (tObj.hashCode() > 0) return; // some other code in between

    tCal4.setLenient(true); // should fire
    tCal4.setLenient(true); // Mutant

    tCal4 = new SimpleDateFormat();
    tCal4.setLenient(true); // should not fire
  }

  /** provoke hits */
  public void testCalendars() {
    // test 1
    Calendar tCal1 = calStatic; // should fire
    Calendar tCal1_mutant = calStatic; // Mutant
    if (tCal1.equals(calStatic)) // hide from unused variable detector;
      // shoud fire
      System.out.println("Cal1 equals calStatic");

    // test 2
    Calendar tCal2 = getCal();
    Calendar tCal2_mutant = getCal(); // Mutant
    if (System.currentTimeMillis() < 1L) return; // some other code in between
    if (tCal2.equals(calStatic)) return; // should fire

    // test 3
    Calendar tCal3 = calInstace;
    Calendar tCal3_mutant = calInstace; // Mutant
    tCal3.clear(); // should fire

    // test 4
    Calendar tCal4 = calStatic2; // should fire
    Calendar tCal4_mutant = calStatic2; // Mutant

    int tInt = 1; // some other code in between
    boolean tBoolean = false; // some other code in between
    Object tObj = new Object(); // some other code in between
    if (tObj.hashCode() > 0) return; // some other code in between

    tCal4.clear(); // should fire
    tCal4.clear(); // Mutant

    tCal4 = new GregorianCalendar();
    tCal4.clear(); // should not fire
  }
}

/**
 * Subclass of {@link DateFormat} for the detector to find.
 *
 * @author ds
 */
class CustomDateFormat extends DateFormat {

  private static final long serialVersionUID = -5673759627954372347L;

  /*
   * (non-Javadoc)
   *
   * @see java.text.DateFormat#format(java.util.Date, java.lang.StringBuffer,
   * java.text.FieldPosition)
   */
  // @Override
  @Override
  public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
    if (fieldPosition == null) return null;
    return toAppendTo.append(date.toString());
  }

  /*
   * (non-Javadoc)
   *
   * @see java.text.DateFormat#parse(java.lang.String,
   * java.text.ParsePosition)
   */
  // @Override
  @Override
  public Date parse(String source, ParsePosition pos) {
    if (source == null || pos == null) return null;
    return new Date(1);
  }
}