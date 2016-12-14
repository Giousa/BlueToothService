package com.giou.bluetoothservice;

import android.content.Context;
import android.widget.Toast;

/**
 * Description:
 * Author:Giousa
 * Date:2016/12/14
 * Email:65489469@qq.com
 */
public class ToastUtl {

    private static Toast mToast;

    public static void SimpleToast(Context context, String string){
        if (mToast==null){
            mToast=Toast.makeText(context, string,Toast.LENGTH_SHORT);
        }else{
            mToast.setText(string);
        }
        mToast.show();
    }
}
