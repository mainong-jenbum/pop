package ui.mainong.pop;

import android.content.Context;
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

    /**
     * Success message
     *
     * @param context to determine the context of calling activity or fragment
     * @param message to display
     * @param duration of the toast message
     * @param position ot the toast message
     */
    public static void success(Context context, String message, int duration, int position){
        setData(context, message, duration, position, PopType.SUCCESS);
    }

    public static void success(Context context, String message, int position){
        success(context, message, duration, position);
    }

    public static void success(Context context, String message){
        success(context, message, duration, position);
    }


    /**
     * Information message
     *
     * @param context to determine the context of calling activity or fragment
     * @param message to display
     * @param duration of the toast message
     * @param position ot the toast message
     */

    public static void info(Context context, String message, int duration, int position){
        setData(context, message, duration, position, PopType.INFO);
    }

    public static void info(Context context, String message, int position){
        info(context, message, duration, position);
    }

    public static void info(Context context, String message){
        info(context, message, duration, position);
    }


    /**
     * Warning Message
     *
     * @param context to determine the context of calling activity or fragment
     * @param message to display
     * @param duration of the toast message
     * @param position ot the toast message
     */

    public static void warn(Context context, String message, int duration, int position){
        setData(context, message, duration, position, PopType.WARN);
    }

    public static void warn(Context context, String message, int position){
        warn(context,message, duration, position);
    }

    public static void warn(Context context, String message){
        warn(context,message, duration, position);
    }


    /**
     * Error Message
     *
     * @param context to determine the context of calling activity or fragment
     * @param message to display
     * @param duration of the toast message
     * @param position ot the toast message
     */

    public static void error(Context context, String message, int duration, int position){
        setData(context, message, duration, position, PopType.ERROR);
    }

    public static void error(Context context, String message, int position){
        error(context, message, duration, position);
    }

    public static void error(Context context, String message){
        error(context, message, duration, position);
    }

    /**
     * Setting data
     */
    private static void setData(Context context, String msg, int duration, int position, PopType type) {
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
        show(context, layout, position, duration);
    }

    /**
     * Creating toast
     */
    private static void show(Context context, View layout, int position, int duration) {
        Toast toast = new Toast(context.getApplicationContext());
        toast.setDuration(duration);
        toast.setGravity(position, 0, 40);
        toast.setView(layout); //setting the view of custom toast layout
        toast.show();
    }
}
