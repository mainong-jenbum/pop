package ui.mainong.pop;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.ContextCompat;


public class Pop {

    private enum PopType {
        SUCCESS, INFO, WARN, ERROR
    }

    private static int position = Gravity.TOP;
    private static int duration = 0;


    private static void setData(Context context, String msg, int position, int duration, PopType type) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View layout = layoutInflater.inflate(R.layout.layout_pop,null);
        ImageView popIcon = layout.findViewById(R.id.pop_icon);
        TextView  popMsg = layout.findViewById(R.id.pop_message);

        Drawable bgPop = ContextCompat.getDrawable(context, R.drawable.bg_pop_success);
        Drawable bgIcon = ContextCompat.getDrawable(context, R.drawable.ic_success);

        switch (type) {
            case SUCCESS:
                bgPop = ContextCompat.getDrawable(context, R.drawable.bg_pop_success);
                bgIcon = ContextCompat.getDrawable(context, R.drawable.ic_success);
                break;

            case INFO:
                bgPop = ContextCompat.getDrawable(context, R.drawable.bg_pop_info);
                bgIcon = ContextCompat.getDrawable(context, R.drawable.ic_info);
                break;

            case WARN:
                bgPop = ContextCompat.getDrawable(context, R.drawable.bg_pop_warn);
                bgIcon = ContextCompat.getDrawable(context, R.drawable.ic_warning);
                break;

            case ERROR:
                bgPop = ContextCompat.getDrawable(context, R.drawable.bg_pop_error);
                bgIcon = ContextCompat.getDrawable(context, R.drawable.ic_error);
                break;
        }

        popIcon.setImageDrawable(bgIcon);
        layout.setBackground(bgPop);
        popMsg.setText(msg);
        createToast(context,layout,position,duration);
    }

    /**
     *
     * Success Toast
     */
    public static void success(Context context, String message, int position, int duration){
        setData(context, message, position, duration, PopType.SUCCESS);
    }

    public static void success(Context context, String message, int position){
        info(context,message,position,duration);
    }

    public static void success(Context context, String message){
        info(context,message,position,duration);
    }


    /**
     *  Info Toast
     */

    public static void info(Context context, String message, int position, int duration){
        setData(context, message, position, duration, PopType.INFO);
    }

    public static void info(Context context, String message, int position){
        info(context,message,position,duration);
    }

    public static void info(Context context, String message){
        info(context,message,position,duration);
    }


    /**
     * Warning Toast
     */

    public static void warn(Context context, String message, int position, int duration){
        setData(context, message, position, duration, PopType.WARN);
    }

    public static void warn(Context context, String message, int position){
        info(context,message,position,duration);
    }

    public static void warn(Context context, String message){
        info(context,message,position,duration);
    }


    /**
     *  Error Toast
     */

    public static void error(Context context, String message, int position, int duration){
        setData(context, message, position, duration, PopType.ERROR);
    }

    public static void error(Context context, String message, int position){
        error(context,message, position, duration);
    }

    public static void error(Context context, String message){
        error(context,message,position,duration);
    }

    /**
     * Creating toast
     */
    private static void createToast(Context context, View layout, int position, int duration) {
        Toast toast = new Toast(context.getApplicationContext());
        toast.setDuration(duration);
        toast.setGravity(position, 0, 40);
        toast.setView(layout); //setting the view of custom toast layout
        toast.show();
    }
}
