package com.example.bruce.thisoldhouse;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.util.Log;
import android.widget.*;


public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";
    private static int onResumeCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate() run");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "onStart() method");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "onRestart() method");
    }

    @Override
    protected void onResume(){
        super.onResume();
        onResumeCount++;
        Log.d(TAG, "onResume() method called" + onResumeCount + " times");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "onPause() method");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "onStop() method");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy() method");
    }

    /*
    @Override
    protected void onSaveInstanceBundle(Bundle savedState){
        super.onSaveInstanceState(savedState);
        Log.d(TAG, "saving our activity state: onSaveInstanceState");
        final EditText textBox = (EditText) findViewById(R.id.userEntry);
        CharSequence userText = textBox.getText();
        savedState.putCharSequence("savedText", userText);
        Log.d(TAG, "saved the value of userEntry");
    }*/

    @Override
    protected void onRestoreInstanceState(Bundle savedState){
        super.onRestoreInstanceState(savedState);
        Log.d(TAG, "restoring our activity state: onRestoreInstanceState");
        final EditText textBox = (EditText) findViewById(R.id.userEntry);
    }


    public void startSecondActivity(View v){
        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
