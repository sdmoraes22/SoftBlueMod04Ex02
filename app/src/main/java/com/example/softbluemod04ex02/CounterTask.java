package com.example.softbluemod04ex02;

import android.os.AsyncTask;
import android.os.SystemClock;
import android.widget.Button;
import android.widget.TextView;

public class CounterTask extends AsyncTask<Integer, Integer, Void> {

    private Button button;
    private TextView textView;

    public CounterTask(Button button, TextView textView) {
        this.button = button;
        this.textView = textView;
    }

    @Override
    protected void onPreExecute() {
        button.setEnabled(false);
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        button.setEnabled(true);
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        textView.setText(String.valueOf(values[0]));
    }

    @Override
    protected Void doInBackground(Integer... integers) {
        int max = integers[0];
        for(int i = 10; i >= max; i--) {
            SystemClock.sleep(1000);
            publishProgress(i);
        }
        return null;
    }
}
