package edu.syr.ischool.glassboard;

/**
 * Created by Aravind on 1/8/2015.
 * Adapted from http://www.lengrand.fr/2013/10/integrate-a-twitter-timeline-in-your-android-application
 */

import android.graphics.Color;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class TwitterActivity extends NotificationActivity
{

    public static final String TAG = "TimeLineActivity";

 //   private static final String baseURl = "https://twitter.com";

    private static final String widgetInfo = "http://aravindgee.com/glassboard/glass.html?ggg";
  /*/  private static final String widgetInfo =
            "<html>\n" +
                    "\t<head>\n" +
                    "\t\t<script type=\"text/javascript\" src=\"https://platform.twitter.com/widgets.js\"></script>\n" +
                    "\n" +
                    "\t\t<script> window.setTimeout(function(){document.getElementById('twitter-widget-0').style = \"border: medium none; max-width: 100%; min-width: 100%;\";}, 5000);</script>\n" +
                    "\t</head>\n" +
                    "\t<body>\n" +
                    "\n" +
                    "\t<a id=\"twitter\" class=\"twitter-timeline\"\n" +
                    "\t  href=\"https://twitter.com/twitterapi\"\n" +
                    "\t  data-widget-id=\"554181477810708480\"\n" +
                    "\t  width=\"100%\"\n" +
                    "\theight=\"100%\"\n" +
                    "\t  data-show-replies=\"true\"\n" +
                    "\t  data-chrome=\"nofooter\"></a> \n" +
                    "\t  </body>\n" +
                    "<script>document.getElementById(\"twitter\").focus();</script>\n" +
                    "</html>\n";*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);

        WebView webView = (WebView) findViewById(R.id.timeline_webview);
        webView.clearCache(true);

        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDefaultFontSize(14);
        webView.setBackgroundColor(Color.TRANSPARENT);
        webView.setVerticalScrollBarEnabled(true);

      //  webView.loadDataWithBaseURL(baseURl, widgetInfo, "text/html", "UTF-8", null);
        webView.loadUrl(widgetInfo);
    }
}