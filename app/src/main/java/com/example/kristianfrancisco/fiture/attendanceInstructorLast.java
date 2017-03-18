package com.example.kristianfrancisco.fiture;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.kristianfrancisco.fiture.attendance_instructor_log;
import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

/**
 * Created by Hannah on 3/19/2017.
 */

public class attendanceInstructorLast extends AppCompatActivity implements ZXingScannerView.ResultHandler {

    private ZXingScannerView mScannerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mScannerView = new ZXingScannerView(this);
        setContentView(mScannerView);
        mScannerView.setResultHandler(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mScannerView.stopCamera();
    }

    @Override
    public void handleResult(Result result) {
        if(result.getText().equals("SLIMMERSWORLD")){
            finish();
            startActivity(new Intent(this, attendance_instructor_log.class));
        }
        else
            Toast.makeText(this, "Invalid QR Code!", Toast.LENGTH_SHORT).show();
    }
}
