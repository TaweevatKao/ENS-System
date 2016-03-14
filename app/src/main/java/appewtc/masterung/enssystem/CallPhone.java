package appewtc.masterung.enssystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class CallPhone extends AppCompatActivity {

    //Explicit
    private LinearLayout topLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_phone);

        //bindwidget
        bindwidget();

        //showchoose
        showChoose();

    }//main method

    private void showChoose() {

        int intBackGround = getIntent().getIntExtra("Icon", R.drawable.catagory1);
        topLinearLayout.setBackgroundResource(intBackGround);

    }

    private void bindwidget() {
        topLinearLayout = (LinearLayout) findViewById(R.id.linTopCallPhone);


    }


} // main class
