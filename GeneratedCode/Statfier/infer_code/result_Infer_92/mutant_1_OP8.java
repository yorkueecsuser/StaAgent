import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import codetoanalyze.java.InferTaint;
import java.io.File;
import java.net.URISyntaxException;

class WebViews {

  void callWebviewSinks(WebView webview) {
    String stringSource = (String) InferTaint.inferSecretSource();

    webview.evaluateJavascript(stringSource, null);
    webview.loadData(stringSource, "", "");
    webview.loadDataWithBaseURL("", stringSource, "", "", "");
    webview.loadUrl(stringSource); // should have 5 reports
    webview.postUrl(stringSource, null);
    webview.postWebMessage(null, (Uri) InferTaint.inferSecretSource());
  }

  // make sure all of the rules apply to subclasses as well
  class MyWebView extends WebView {
    public MyWebView(Context c) {
      super(c);
    }
  }

  Activity mActivity;

  class MyWebViewClient extends WebViewClient {

    @Override
    public void onLoadResource(WebView w, String url) {
      try {
        Intent i = Intent.parseUri(url, 0);
        mActivity.startActivity(i); // should report
      } catch (URISyntaxException e) {
      }
    }

    @Override
    public WebResourceResponse shouldInterceptRequest(WebView w, WebResourceRequest request) {
      mActivity.startActivity(new Intent("action", request.getUrl())); // should report
      return null;
    }

    File webResourceToFileBad(WebResourceRequest request) {
      return new File(request.getUrl().getPath());
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView w, String url) {
      try {
        Intent i = Intent.parseUri(url, 0);
        mActivity.startActivity(i); // should report
      } catch (URISyntaxException e) {
      }
      return false;
    }
  }

  class MyWebChromeClient extends WebChromeClient {

    @Override
    public boolean onJsAlert(WebView w, String url, String message, JsResult result) {
      try {
        Intent i = Intent.parseUri(url, 0);
        mActivity.startActivity(i);
      } catch (URISyntaxException e) {
      }
      return false;
    }

    @Override
    public boolean onJsBeforeUnload(WebView w, String url, String m, JsResult result) {
      try {
        Intent i = Intent.parseUri(url, 0);
        mActivity.startActivity(i);
      } catch (URISyntaxException e) {
      }
      return false;
    }

    @Override
    public boolean onJsConfirm(WebView w, String url, String m, JsResult result) {
      try {
        Intent i = Intent.parseUri(url, 0);
        mActivity.startActivity(i);
      } catch (URISyntaxException e) {
      }
      return false;
    }

    @Override
    public boolean onJsPrompt(WebView w, String url, String m, String s, JsPromptResult result) {
      try {
        Intent i = Intent.parseUri(url, 0);
        mActivity.startActivity(i);
      } catch (URISyntaxException e) {
      }
      return false;
    }
  }

  void callWebviewSubclassSink(MyWebView webview) {
    String stringSource = (String) InferTaint.inferSecretSource();
    webview.evaluateJavascript(stringSource, null);
  }

  class JsObject {
    @JavascriptInterface
    Object returnSource() {
      return InferTaint.inferSecretSource();
    }
  }

  // in order to get this, we have to understand that addJavaScriptInterface can evaluate the
  // JsObject.returnSource method
  void FN_addJavascriptInterface(MyWebView webview) {
    // should warn here
    webview.addJavascriptInterface(new JsObject(), "injectedObject");
  }

  // Mutated code
  void callWebviewSinksMutated(WebView x) {
    String y = (String) InferTaint.inferSecretSource();

    x.evaluateJavascript(y, null);
    x.loadData(y, "", "");
    x.loadDataWithBaseURL("", y, "", "", "");
    x.loadUrl(y); // should have 5 reports
    x.postUrl(y, null);
    x.postWebMessage(null, (Uri) InferTaint.inferSecretSource());
  }

  class MyWebViewMutated extends WebView {
    public MyWebViewMutated(Context z) {
      super(z);
    }
  }

  Activity bActivity;

  class MyWebViewClientMutated extends WebViewClient {

    @Override
    public void onLoadResource(WebView w, String v) {
      try {
        Intent i = Intent.parseUri(v, 0);
        bActivity.startActivity(i); // should report
      } catch (URISyntaxException e) {
      }
    }

    @Override
    public WebResourceResponse shouldInterceptRequest(WebView w, WebResourceRequest q) {
      bActivity.startActivity(new Intent("action", q.getUrl())); // should report
      return null;
    }

    File webResourceToFileBadMutated(WebResourceRequest q) {
      return new File(q.getUrl().getPath());
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView w, String v) {
      try {
        Intent i = Intent.parseUri(v, 0);
        bActivity.startActivity(i); // should report
      } catch (URISyntaxException e) {
      }
      return false;
    }
  }

  class MyWebChromeClientMutated extends WebChromeClient {

    @Override
    public boolean onJsAlert(WebView w, String v, String m, JsResult result) {
      try {
        Intent i = Intent.parseUri(v, 0);
        bActivity.startActivity(i);
      } catch (URISyntaxException e) {
      }
      return false;
    }

    @Override
    public boolean onJsBeforeUnload(WebView w, String v, String m, JsResult result) {
      try {
        Intent i = Intent.parseUri(v, 0);
        bActivity.startActivity(i);
      } catch (URISyntaxException e) {
      }
      return false;
    }

    @Override
    public boolean onJsConfirm(WebView w, String v, String m, JsResult result) {
      try {
        Intent i = Intent.parseUri(v, 0);
        bActivity.startActivity(i);
      } catch (URISyntaxException e) {
      }
      return false;
    }

    @Override
    public boolean onJsPrompt(WebView w, String v, String m, String s, JsPromptResult result) {
      try {
        Intent i = Intent.parseUri(v, 0);
        bActivity.startActivity(i);
      } catch (URISyntaxException e) {
      }
      return false;
    }
  }

  void callWebviewSubclassSinkMutated(MyWebView x) {
    String y = (String) InferTaint.inferSecretSource();
    x.evaluateJavascript(y, null);
  }

  class JsObjectMutated {
    @JavascriptInterface
    Object returnSourceMutated() {
      return InferTaint.inferSecretSource();
    }
  }

  // in order to get this, we have to understand that addJavaScriptInterface can evaluate the
  // JsObject.returnSource method
  void FN_addJavascriptInterfaceMutated(MyWebView x) {
    // should warn here
    x.addJavascriptInterface(new JsObjectMutated(), "injectedObject");
  }
}