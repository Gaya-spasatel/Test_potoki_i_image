package com.example.test_potoki_i_image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadPic extends AsyncTask<Void, InputStream, Void> {
    private String url = "https://cameralabs.org/media/cameralabs/images/Tanya/_II_October/14.10/1on-the-way-down-mount-rainier-washington.jpg";
    private Bitmap bitmap;
    @Override
    protected Void doInBackground(Void... voids) {
        try {
            URL pic = new URL(url);
            InputStream input = pic.openStream();
            bitmap = BitmapFactory.decodeStream(input);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
    //protected void onProgressUpdate
}
