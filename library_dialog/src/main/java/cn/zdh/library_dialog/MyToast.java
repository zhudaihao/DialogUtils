package cn.zdh.library_dialog;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.github.chengang.library.TickView;


/**
 * 常用Toast
 */

public class MyToast {

    private MyToast() {
    }

    private static final MyToast myToast = new MyToast();

    public static final MyToast getInstance() {
        return myToast;
    }

    /**
     * --------------------自定义toast-----------------------------------
     */

    public void showToastButton(Context context, String content) {
        //new的toast要2执行他两个属性
        Toast mToast = new Toast(context);
        //创建布局
        View layout = View.inflate(context, R.layout.toast_layout, null);
        mToast.setView(layout);

        //获取控件
        TextView textView = (TextView) layout.findViewById(R.id.tv_text);
        //设置显示文本
        textView.setText(content);

        //设置间距
        textView.setPadding(16, 12, 16, 12);

        //定义Toast的位置
        mToast.setGravity(Gravity.FILL_HORIZONTAL | Gravity.BOTTOM, 0, 96 * 2);
        //2设置时间
        mToast.setDuration(Toast.LENGTH_SHORT);

        mToast.show();//不要忘记启动Toast
    }


    //旋转加载
    public void showToastShape(Context context, String gainCoinNum) {
        Toast mToast = new Toast(context);
        View inflate = View.inflate(context, R.layout.toast_center_layout, null);
        mToast.setView(inflate);
        //获取控件
        TextView tv_num = (TextView) inflate.findViewById(R.id.tv_num);
        tv_num.setText(gainCoinNum);
        //设置位置
        mToast.setGravity(Gravity.CENTER, 0, 0);
        //2设置时间
        mToast.setDuration(Toast.LENGTH_SHORT);
        mToast.show();


    }


    //动画
    public void showToastShapeAnimation(Context context) {
        Toast mToast = new Toast(context);
        View view = View.inflate(context, R.layout.toast_anim_layout, null);
        mToast.setView(view);
        TickView tickView = view.findViewById(R.id.tick_view);
        tickView.setChecked(true);

        //设置位置
        mToast.setGravity(Gravity.CENTER, 0, 0);
        //2设置时间
        mToast.setDuration(Toast.LENGTH_SHORT);
        mToast.show();


    }

    /**
     * -----------------普通toast---------------------------------------
     */
    public void shownToast(Context context, String content) {
        Toast toast = Toast.makeText(context, content, Toast.LENGTH_SHORT);
        //toast.setGravity(Gravity.CENTER, 0, 0);//设置位置
        toast.show();
    }


}
