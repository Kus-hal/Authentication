package com.example.infobyte_assign;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    PDFView pdfView = findViewById(R.id.pdfView);
        pdfview.fromAsset (assetName: "Kushal_Resume.pdf").Load();


    }
}