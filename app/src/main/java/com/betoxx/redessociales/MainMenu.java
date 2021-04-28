package com.betoxx.redessociales;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.ShareButton;

public class MainMenu extends AppCompatActivity {

    private Button btnPublishLink;
    private EditText txtLink;
    private ShareButton shareButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        btnPublishLink = findViewById(R.id.btnPublishLink);
        txtLink = findViewById(R.id.txtLink);
        shareButton = (ShareButton) findViewById(R.id.share_btn);

        btnPublishLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShareLinkContent content = new ShareLinkContent.Builder()
                        .setContentUrl(Uri.parse(txtLink.getText().toString()))
                        .build();
                shareButton.setShareContent(content);
            }
        });
    }
}