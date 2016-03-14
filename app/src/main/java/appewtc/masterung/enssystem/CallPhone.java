package appewtc.masterung.enssystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.List;

public class CallPhone extends AppCompatActivity {

    //Explicit
    private LinearLayout topLinearLayout;
    private ListView phoneListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_phone);

        //bindwidget
        bindwidget();

        //showchoose
        showChoose();

        //Create listview
        createListView();

    }//main method

    private void createListView() {

        String[] callStrings = getIntent().getStringArrayExtra("Call");
        String[] phoneStrings = getIntent().getStringArrayExtra("Phone");

        PhoneAdapter phoneAdapter = new PhoneAdapter(CallPhone.this, callStrings, phoneStrings);
        phoneListView.setAdapter(phoneAdapter);


    }

    private void showChoose() {

        int intBackGround = getIntent().getIntExtra("Icon", R.drawable.catagory1);
        topLinearLayout.setBackgroundResource(intBackGround);

    }

    private void bindwidget() {
        topLinearLayout = (LinearLayout) findViewById(R.id.linTopCallPhone);
        phoneListView = (ListView) findViewById(R.id.listView2);


    }


} // main class
