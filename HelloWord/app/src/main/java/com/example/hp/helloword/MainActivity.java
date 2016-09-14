package com.example.hp.helloword;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickHandle(View Source){
//        TextView tv=(TextView)findViewById(R.id.testTxt);
//        tv.setText("123456");
        VideoView vv=(VideoView)findViewById(R.id.video);
        Uri url=Uri.parse("http://static.zqgame.com/html/playvideo.html?name=http://lom.zqgame.com/v1/video/LOM_Promo~2.flv");
        vv.setVideoURI(url);
    }
}
