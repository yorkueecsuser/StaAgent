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
        break;
      case 2:
        source = String.valueOf(l.getBearing());
        break;
      case 3:
        source = String.valueOf(l.getLatitude());
        break;
      case 4:
        source = String.valueOf(l.getLongitude());
        break;
      case 5:
        source = String.valueOf(l.getSpeed());
        break;
      case 6:
        source = t.getDeviceId();
        break;
      case 7:
        source = t.getLine1Number();
        break;
      case 8:
        source = t.getSimSerialNumber();
        break;
      case 9:
        source = t.getSubscriberId();
        break;
      case 10:
        source = t.getVoiceMailNumber();
        break;
    }

    String TAG = "tag";
    Log.e(TAG, source);
    Log.println(0, TAG, source);
    Log.w(TAG, source);
    Log.wtf(TAG, source); // 10 sources * 4 sinks = 40 expected reports

    // Mutated code
    String x = null;
    switch (rand()) {
      case 1:
        x = String.valueOf(l.getAltitude());
        break;
      case 2:
        x = String.valueOf(l.getBearing());
        break;
      case 3:
        x = String.valueOf(l.getLatitude());
        break;
      case 4:
        x = String.valueOf(l.getLongitude());
        break;
      case 5:
        x = String.valueOf(l.getSpeed());
        break;
      case 6:
        x = t.getDeviceId();
        break;
      case 7:
        x = t.getLine1Number();
        break;
      case 8:
        x = t.getSimSerialNumber();
        break;
      case 9:
        x = t.getSubscriberId();
        break;
      case 10:
        x = t.getVoiceMailNumber();
        break;
    }

    String y = "tag";
    Log.e(y, x);
    Log.println(0, y, x);
    Log.w(y, x);
    Log.wtf(y, x); // 10 sources * 4 sinks = 40 expected reports
  }
}