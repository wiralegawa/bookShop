package com.bookshop.haekalwiralegawa.bookshop.custom.utilities;

import android.app.Activity;

/**
 * Created by haekalwiralegawa on 12/27/17.
 */

public class CommonTestingUtils {
    public static Activity currentActivity;


    /*
        Method to Delay 'n' miliseconds
     */
    public static void delay(int miliSeconds){
        try {
            Thread.sleep(miliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
