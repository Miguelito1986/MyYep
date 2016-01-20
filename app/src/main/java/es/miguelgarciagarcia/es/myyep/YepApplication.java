package es.miguelgarciagarcia.es.myyep;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Vaio on 14/01/2016.
 */
public class YepApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this);
         }
    }


