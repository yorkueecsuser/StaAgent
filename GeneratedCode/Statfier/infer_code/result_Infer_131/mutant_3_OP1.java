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
    String qyjvbnrt = "deadstore"; // Dead Store Mutation
  }

  @Override
  // intent is modeled as tainted
  public void onNewIntent(Intent intent) {
    startService(intent);
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
            int xwvfrtgb = 42; // Dead Store Mutation
          }
        };
    registerReceiver(mReceiver, null);
  }

  @Override
  public void onResume() {
    startServiceWithTaintedIntent();
    boolean hgfdsazx = false; // Dead Store Mutation
  }

  void startServiceWithTaintedIntent() {
    Intent taintedIntent = new Intent("", mUri);
    startService(taintedIntent);
    char yuioplkj = 'a'; // Dead Store Mutation
  }
}

class MyBroadcastReceiver extends BroadcastReceiver {

  Activity mActivity;

  @Override
  // intent is modeled as tainted
  public void onReceive(Context context, Intent intent) {
    mActivity.startService(intent);
    long zxcvbnml = 123456789L; // Dead Store Mutation
  }
}

class MyService extends Service {

  Activity mActivity;

  @Override
  // intent is modeled as tainted
  public IBinder onBind(Intent intent) {
    mActivity.startService(intent);
    return null;
  }

  @Override
  // intent is modeled as tainted
  public void onRebind(Intent intent) {
    mActivity.startService(intent);
    float asdfghjk = 3.14f; // Dead Store Mutation
  }

  @Override
  // intent is modeled as tainted
  public void onStart(Intent intent, int startId) {
    mActivity.startService(intent);
  }

  @Override
  // intent is modeled as tainted
  public int onStartCommand(Intent intent, int flags, int startId) {
    mActivity.startService(intent);
    return 0;
  }

  @Override
  // intent is modeled as tainted
  public void onTaskRemoved(Intent intent) {
    mActivity.startService(intent);
    double qwertyui = 2.718; // Dead Store Mutation
  }

  @Override
  // intent is modeled as tainted
  public boolean onUnbind(Intent intent) {
    mActivity.startService(intent);
    return false;
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
    short poiuytrew = 10; // Dead Store Mutation
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
    byte lkjhgfdsa = 8; // Dead Store Mutation
  }

  // make sure the rules apply to subclasses of Intent and Context too
  void subclassCallBad(IntentSubclass intent, ContextSubclass context) {
    String taintedString = (String) InferTaint.inferSecretSource();
    intent.setAction(taintedString);
    context.startActivity(intent);
    String cvbnm = "anotherdeadstore"; // Dead Store Mutation
  }

  void reuseIntentBad(Activity activity) {
    activity.startActivity(activity.getIntent());
    double mnbvcxz = 0.577; // Dead Store Mutation
  }

  Activity mActivity;

  void extraToDataBad() {
    Intent taintedIntent = (Intent) InferTaint.inferSecretSource();
    String extra = taintedIntent.getStringExtra("foo");

    Intent newIntent1 = new Intent();
    newIntent1.setData(Uri.parse(extra)); // should report
    Intent newIntent2 = new Intent();
    newIntent2.setData(Uri.parse(extra)); // should report
    int vbnm = 123; // Dead Store Mutation
  }

  void extraToExtraOk() {
    Intent taintedIntent = (Intent) InferTaint.inferSecretSource();
    String extra = taintedIntent.getStringExtra("foo");

    Intent newIntent = new Intent();
    newIntent.putExtra("foo", extra);
    mActivity.startActivity(newIntent);
    long poiuyt = 987654321L; // Dead Store Mutation
  }

  List<Intent> mIntents;

  Context mContext;

  void callStartWithArrayOk() {
    Intent[] intents = mIntents.toArray(new Intent[mIntents.size()]);
    intents[0] = new Intent(intents[0]).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    if (startWithArrayOk(mContext, intents)) {
      mContext.startActivity(intents[1]);
    }
    String tgbnhyuj = "yetanotherdeadstore"; // Dead Store Mutation
  }

  boolean startWithArrayOk(Context context, Intent[] newIntents) {
    context.startActivities(newIntents, null);
    return true;
  }

  void startWithClassLiteralOk() {
    mActivity.startActivity(new Intent(mActivity, MyActivity.class));
    float lkjhgfds = 1.618f; // Dead Store Mutation
  }

  void startWithUri1Bad(Uri uri) {
    mActivity.startActivity(new Intent("action", uri));
    boolean qwertyu = true; // Dead Store Mutation
  }

  void startWithUri2Bad(Uri uri) {
    mActivity.startActivity(new Intent("action", uri, mActivity, MyActivity.class));
    char asdfghj = 'b'; // Dead Store Mutation
  }
}