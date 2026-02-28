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
        source = String.valueOf(l.getAltitude()); // Mutant: duplicated assignment
        break;
      case 2:
        source = String.valueOf(l.getBearing());
        source = String.valueOf(l.getBearing()); // Mutant: duplicated assignment
        break;
      case 3:
        source = String.valueOf(l.getLatitude());
        source = String.valueOf(l.getLatitude()); // Mutant: duplicated assignment
        break;
      case 4:
        source = String.valueOf(l.getLongitude());
        source = String.valueOf(l.getLongitude()); // Mutant: duplicated assignment
        break;
      case 5:
        source = String.valueOf(l.getSpeed());
        source = String.valueOf(l.getSpeed()); // Mutant: duplicated assignment
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
  }
}