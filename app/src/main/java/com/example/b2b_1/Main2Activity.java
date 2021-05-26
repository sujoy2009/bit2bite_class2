package com.example.b2b_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class Main2Activity extends AppCompatActivity {
    Button b1;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    RadioGroup rg1;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        rg1=(RadioGroup)findViewById(R.id.rgid);
        rb1=(RadioButton)findViewById(R.id.rb1id);

        rb2=(RadioButton)findViewById(R.id.rb2id);
        rb3=(RadioButton)findViewById(R.id.rb3id);

        b1=(Button)findViewById(R.id.b1id);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ischecked=rg1.getCheckedRadioButtonId();

                if(ischecked==-1){

                    Toast.makeText(Main2Activity.this,"sellect one",Toast.LENGTH_LONG).show();

                }
                else{
                    seturl(ischecked);
                    ConnectivityManager manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                    NetworkInfo activeNetwork=manager.getActiveNetworkInfo();
                    if(null==activeNetwork){

                        Toast.makeText(Main2Activity.this,"No netwark",Toast.LENGTH_LONG).show();
                    }
                    Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                    intent.putExtra("varsitykey", url);
                    startActivity(intent);

                }

            }

            private void seturl(int ischecked) {
                switch (ischecked){
                    case R.id.rb1id:
                        url="https://www.kuet.ac.bd/";

                        break;
                    case R.id.rb2id:
                        url="https://www.kuet.ac.bd/";

                        break;
                    case R.id.rb3id:
                        url="https://www.kuet.ac.bd/";

                        break;
                }
            }
        });
    }
}
