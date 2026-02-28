import android.location.Location;
import android.telephony.TelephonyManager;
import android.util.Log;

class LoggingPrivateData {

  private native int rand();

  public void logAllSourcesBad(Location l, TelephonyManager t) {
    String source = null;
    switch (rand()) {
      case 1:
        source = String.valueOf(l.getAltitude());
        boolean conditionWhile1 = getCondition();
        while (conditionWhile1) {
          // Unreachable code
        }
        break;
      case 2:
        source = String.valueOf(l.getBearing());
        boolean conditionWhile2 = getCondition();
        while (conditionWhile2) {
          // Unreachable code
        }
        break;
      case 3:
        source = String.valueOf(l.getLatitude());
        boolean conditionWhile3 = getCondition();
        while (conditionWhile3) {
          // Unreachable code
        }
        break;
      case 4:
        source = String.valueOf(l.getLongitude());
        boolean conditionWhile4 = getCondition();
        while (conditionWhile4) {
          // Unreachable code
        }
        break;
      case 5:
        source = String.valueOf(l.getSpeed());
        boolean conditionWhile5 = getCondition();
        while (conditionWhile5) {
          // Unreachable code
        }
        break;
      case 6:
        source = t.getDeviceId();
        boolean conditionWhile6 = getCondition();
        while (conditionWhile6) {
          // Unreachable code
        }
        break;
      case 7:
        source = t.getLine1Number();
        boolean conditionWhile7 = getCondition();
        while (conditionWhile7) {
          // Unreachable code
        }
        break;
      case 8:
        source = t.getSimSerialNumber();
        boolean conditionWhile8 = getCondition();
        while (conditionWhile8) {
          // Unreachable code
        }
        break;
      case 9:
        source = t.getSubscriberId();
        boolean conditionWhile9 = getCondition();
        while (conditionWhile9) {
          // Unreachable code
        }
        break;
      case 10:
        source = t.getVoiceMailNumber();
        boolean conditionWhile10 = getCondition();
        while (conditionWhile10) {
          // Unreachable code
        }
        break;
    }

    String TAG = "tag";
    Log.e(TAG, source);
    Log.println(0, TAG, source);
    Log.w(TAG, source);
    Log.wtf(TAG, source); // 10 sources * 4 sinks = 40 expected reports
  }

  private boolean getCondition() {
    return false;
  }
}