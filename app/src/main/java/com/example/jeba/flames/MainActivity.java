package com.example.jeba.flames;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    Button show;
    TextView view1,frmtext;
    EditText name1, pname;
    FrameLayout frame;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this, "WELCOME", Toast.LENGTH_SHORT).show();
        view1 = (TextView) findViewById(R.id.textView3);
        name1 = findViewById(R.id.name);
        pname = findViewById(R.id.pname);
        frmtext=findViewById(R.id.textView6);
        show = findViewById(R.id.button);
        frame=findViewById(R.id.edit_frame);
        view1.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        view1.setSelected(true);
        view1.setSingleLine();
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myname;
                myname = name1.getText().toString();
                String paname = pname.getText().toString();

                if (myname.equals("") || paname.equals("")) {

                    Toast toast = Toast.makeText(MainActivity.this, "name please...", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                    toast.show();


                } else if (myname.equals(paname)) {

                    Toast.makeText(MainActivity.this, "IT IS SAME", Toast.LENGTH_SHORT).show();


                }
                else {
                    hello jb= new hello();


                    String cname= jb.removeDuplicateChars(myname);
                    String c1name= jb.removeDuplicateChars(paname);
                      String tname=c1name+cname;
                    String c2name= jb.removeDuplicateChars(tname);
                      int total=c2name.length();
                    Toast.makeText(MainActivity.this, c2name+total, Toast.LENGTH_SHORT).show();
                    if (total==2||total== 8|| total==10||total==14||total==12) {
                        //friend

                    }
                    else if(total==6){

                        //l
                        frame.setBackgroundColor(Color.GREEN);
                    }

                    else if(total == 5){
                       //a
                    frame.setBackgroundColor(Color.YELLOW);
                }

                    else if(total==9||total==11){
                       // m
                    frame.setBackgroundColor(Color.BLACK);
                }

                    else if(total==3){
                        frame.setBackgroundColor(Color.WHITE);

                    }
                    else if(total==1||total==4||total==7||total==13){
                        frame.setBackgroundColor(Color.BLUE);
                    }


                }

        }

    });

    }


}
class hello {

    String removeDuplicateChars(String sourceStr) {
        // Store encountered letters in this string.
        char[] chrArray = sourceStr.toCharArray();
        String targetStr ="";

        for (char value : chrArray) {
            if (targetStr.indexOf(value) == -1) {
                targetStr += value; // Use StringBuilder as shown below
            }
        }
        return targetStr;
    }
}
