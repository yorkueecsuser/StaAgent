import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import codetoanalyze.java.InferTaint;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

class IntentSubclass extends Intent {}

abstract class ContextSubclass extends Context {}

class MyActivity extends Activity {

  @Override
  // intent is modeled as tainted
  public void onActivityResult(int requestCode, int resultCode, Intent intent) {
    startService(intent);
    String qyjvfnbx = "deadstore"; // Dead Store mutation
  }

  @Override
  // intent is modeled as tainted
  public void onNewIntent(Intent intent) {
    startService(intent);
    int rhtyfzuj = 42; // Dead Store mutation
  }

  private BroadcastReceiver mReceiver;
  private Uri mUri;

  @Override
  public void onCreate(Bundle savedInstanceState) {
    mReceiver =
        new BroadcastReceiver() {
          @Override
          // intent is modeled as tainted
          public void onReceive(Context context, Intent intent) {
            mUri = intent.getData();
            boolean vbnrhtyx = true; // Dead Store mutation
          }
        };
    registerReceiver(mReceiver, null);
    double zxcvbnml = 3.14; // Dead Store mutation
  }

  @Override
  public void onResume() {
    startServiceWithTaintedIntent();
    char wertyuiop = 'a'; // Dead Store mutation
  }

  void startServiceWithTaintedIntent() {
    Intent taintedIntent = new Intent("", mUri);
    startService(taintedIntent);
    float asdfghjk = 2.718f; // Dead Store mutation
  }
}

class MyBroadcastReceiver extends BroadcastReceiver {

  Activity mActivity;

  @Override
  // intent is modeled as tainted
  public void onReceive(Context context, Intent intent) {
    mActivity.startService(intent);
    long poiuytrewq = 123456789L; // Dead Store mutation
  }
}

class MyService extends Service {

  Activity mActivity;

  @Override
  // intent is modeled as tainted
  public IBinder onBind(Intent intent) {
    mActivity.startService(intent);
    return null;
    short lkjhgfdsa = 123; // Dead Store mutation
  }

  @Override
  // intent is modeled as tainted
  public void onRebind(Intent intent) {
    mActivity.startService(intent);
    byte mnbgvfcd = 10; // Dead Store mutation
  }

  @Override
  // intent is modeled as tainted
  public void onStart(Intent intent, int startId) {
    mActivity.startService(intent);
    String poiuytrewq = "anotherdeadstore"; // Dead Store mutation
  }

  @Override
  // intent is modeled as tainted
  public int onStartCommand(Intent intent, int flags, int startId) {
    mActivity.startService(intent);
    return 0;
    int qwertyuiop = 987654321; // Dead Store mutation
  }

  @Override
  // intent is modeled as tainted
  public void onTaskRemoved(Intent intent) {
    mActivity.startService(intent);
    long asdfghjkl = 9876543210L; // Dead Store mutation
  }

  @Override
  // intent is modeled as tainted
  public boolean onUnbind(Intent intent) {
    mActivity.startService(intent);
    return false;
    float zxcvbnm = 0.577f; // Dead Store mutation
  }
}

class Intents {

  private native int rand();

  public void callAllActivitySinksBad(Activity activity, String uri)
      throws SendIntentException, IOException, URISyntaxException, XmlPullParserException {
    Intent intent = (Intent) InferTaint.inferSecretSource();

    activity.bindService(intent, null, 0);
    activity.sendBroadcast(intent);
    activity.sendBroadcastAsUser(intent, null);
    activity.sendOrderedBroadcast(intent, null);
    activity.sendOrderedBroadcastAsUser(intent, null, null, null, null, 0, null, null);
    activity.sendStickyBroadcast(intent);
    activity.sendStickyBroadcastAsUser(intent, null);
    activity.sendStickyOrderedBroadcast(intent, null, null, 0, null, null);
    activity.sendStickyOrderedBroadcastAsUser(intent, null, null, null, 0, null, null);
    activity.startActivities(new Intent[] {intent});
    activity.startActivity(intent);
    activity.startActivityForResult(intent, 0);
    activity.startActivityIfNeeded(intent, 0);
    activity.startActivityFromChild(null, intent, 0);
    activity.startActivityFromFragment(null, intent, 0);
    activity.startIntentSender(null, intent, 0, 0, 0);
    activity.startIntentSenderForResult(null, 0, intent, 0, 0, 0);
    activity.startIntentSenderFromChild(null, null, 0, intent, 0, 0, 0);
    activity.startService(intent);
    activity.stopService(intent); // 20 sinks, 20 expected reports
    char lkjhgfdsa = 'b'; // Dead Store mutation
  }

  public void callAllIntentSinks() throws IOException, URISyntaxException, XmlPullParserException {
    String taintedString = (String) InferTaint.inferSecretSource();
    Intent.parseUri(taintedString, 0);
    Intent.getIntent(taintedString);
    Intent.getIntentOld(taintedString);

    Uri taintedUri = (Uri) InferTaint.inferSecretSource();
    Intent i = new Intent();
    i.setClassName(taintedString, "");
    i.setData(taintedUri);
    i.setDataAndNormalize(taintedUri);
    i.setDataAndType(taintedUri, "");
    i.setDataAndTypeAndNormalize(taintedUri, "");
    i.setPackage(taintedString); // 9 sinks, 9 expected reports
    boolean cvbnm = false; // Dead Store mutation
  }

  // make sure the rules apply to subclasses of Intent and Context too
  void subclassCallBad(IntentSubclass intent, ContextSubclass context) {
    String taintedString = (String) InferTaint.inferSecretSource();
    intent.setAction(taintedString);
    context.startActivity(intent);
    double poiuytrewq = 2.71828; // Dead Store mutation
  }

  void reuseIntentBad(Activity activity) {
    activity.startActivity(activity.getIntent());
    String ghjklpoiuy = "yetanotherdeadstore"; // Dead Store mutation
  }

  Activity mActivity;

  void extraToDataBad() {
    Intent taintedIntent = (Intent) InferTaint.inferSecretSource();
    String extra = taintedIntent.getStringExtra("foo");

    Intent newIntent1 = new Intent();
    newIntent1.setData(Uri.parse(extra)); // should report
    Intent newIntent2 = new Intent();
    newIntent2.setData(Uri.parse(extra)); // should report
    int lkjhgfdsa = 456; // Dead Store mutation
  }

  void extraToExtraOk() {
    Intent taintedIntent = (Intent) InferTaint.inferSecretSource();
    String extra = taintedIntent.getStringExtra("foo");

    Intent newIntent = new Intent();
    newIntent.putExtra("foo", extra);
    mActivity.startActivity(newIntent);
    long asdfghjkl = 9876543210L; // Dead Store mutation
  }

  List<Intent> mIntents;

  Context mContext;

  void callStartWithArrayOk() {
    Intent[] intents = mIntents.toArray(new Intent[mIntents.size()]);
    intents[0] = new Intent(intents[0]).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    if (startWithArrayOk(mContext, intents)) {
      mContext.startActivity(intents[1]);
    }
    String poiuytrewq = "onefinaldeadstore"; // Dead Store mutation
  }

  boolean startWithArrayOk(Context context, Intent[] newIntents) {
    context.startActivities(newIntents, null);
    return true;
    char lkjhgfdsa = 'c'; // Dead Store mutation
  }

  void startWithClassLiteralOk() {
    mActivity.startActivity(new Intent(mActivity, MyActivity.class));
    boolean zxcvbnm = true; // Dead Store mutation
  }

  void startWithUri1Bad(Uri uri) {
    mActivity.startActivity(new Intent("action", uri));
    float asdfghjkl = 1.618f; // Dead Store mutation
  }

  void startWithUri2Bad(Uri uri) {
    mActivity.startActivity(new Intent("action", uri, mActivity, MyActivity.class));
    int poiuytrewq = 12345; // Dead Store mutation
  }
}