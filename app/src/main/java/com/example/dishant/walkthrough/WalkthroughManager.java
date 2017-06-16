package com.example.dishant.walkthrough;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Dishant on 5/8/2017.
 */

public class WalkthroughManager {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Context context;

    public WalkthroughManager(Context context){
        this.context = context;
        sharedPreferences = context.getSharedPreferences("first",0);
        editor = sharedPreferences.edit();
    }

    public void setFirst(boolean isFirst){
        editor.putBoolean("check",isFirst);
        editor.commit();
    }

    public boolean check(){
        return sharedPreferences.getBoolean("check",true);
    }
}
