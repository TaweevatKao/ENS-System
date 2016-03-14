package appewtc.masterung.enssystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NewsLsitView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_lsit_view);
    } // main method

    public void clickbackNewsList(View view) {
        finish();
    }

}  // main class
