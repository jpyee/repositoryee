package net.learn2develop.HelloWorld;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	TextView myTextView;
	SpannableString tSS = new SpannableString("ABCD123");

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spannableString();
    }
    
    public void spannableString()
    {
        myTextView = (TextView)findViewById(R.id.myText);
        tSS.setSpan(new BackgroundColorSpan(Color.BLACK), 0, 4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);  //红色高亮
		tSS.setSpan(new  ForegroundColorSpan(Color.BLUE), 0, 6,Spannable.SPAN_INCLUSIVE_INCLUSIVE);    //下划线
		tSS.setSpan(new StyleSpan(android.graphics.Typeface.BOLD_ITALIC), 3, 6, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); //斜体
		myTextView.setText(tSS);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
