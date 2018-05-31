package cn.zdh.dialogutils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import cn.zdh.library_dialog.MyDialog;
import cn.zdh.library_dialog.MyToast;
import cn.zdh.library_dialog.PriceEntity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void shown0(View view) {
        MyDialog.getInstance().shownDialogProgress(this);
    }

    public void shown1(View view) {
        MyDialog.getInstance().shownDialog(this, "收货提醒", "18718779900");
        MyDialog.getInstance().setOnclickConfirm(new MyDialog.OnclickConfirm() {
            @Override
            public void onClick(String content) {
                Toast.makeText(MainActivity.this, "测试", Toast.LENGTH_SHORT).show();
            }


        });
    }

    public void shown2(View view) {
        MyDialog.getInstance().shownDialogEdit(this, "充值金额","请输入金额");
        MyDialog.getInstance().setOnclickConfirmEdit(new MyDialog.OnclickConfirmEdit() {
            @Override
            public void onClick(String content) {
                Toast.makeText(MainActivity.this, content, Toast.LENGTH_SHORT).show();
            }


        });
    }

    public void shown3(View view) {
        final List<String> list = new ArrayList<>();
        list.add("武汉分公司");
        list.add("深圳分公司");
        list.add("广州白云公司");
        list.add("浑南分公司");
        list.add("广西白云公司");
        MyDialog.getInstance().shownDialogList(this, list, "收货提醒");

        MyDialog.getInstance().setOnclickConfirmList(new MyDialog.OnclickConfirmList() {
            @Override
            public void onClick(String content) {
                Toast.makeText(MainActivity.this, content, Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void shown4(View view) {
        MyDialog.getInstance().shownDialogCheck(this, "收货提醒","实物奖品将在兑换奖品后一个月时间内发放，注意收货。");
        MyDialog.getInstance().setOnclickConfirmCheck(new MyDialog.OnclickConfirmCheck() {
            @Override
            public void onClick(String content) {
                boolean checked = MyDialog.getInstance().checkBox.isChecked();
                if (checked) {
                    Toast.makeText(MainActivity.this, "勾选", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "请勾选", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    /**
     * -----------------------------------------------
     */

    //选择对话框
    public void shown10(View view) {
        final List<String> list = new ArrayList<>();
        list.add("武汉分公司");
        list.add("深圳分公司");
        list.add("广州白云公司");
        list.add("深圳分公司");
        list.add("广州白云公司");
        list.add("深圳分公司");
        list.add("广州白云公司");
        list.add("深圳分公司");
        list.add("广州白云公司");
        list.add("深圳分公司");
        list.add("广州白云公司");
        MyDialog.getInstance().shownDialogListButton(this, list, "我的竞猜", "提交竞猜");
    }


    //选择对话框
    public void shown14(View view) {

        List<PriceEntity> listDatas = new ArrayList<>();//总的数据源

        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setBingoTimesStr("测试1");
        priceEntity.setAwardItemName("白菜");
        priceEntity.setAwardName("111111000");
        priceEntity.setRewardCoinNum("明细");
        priceEntity.setImageUrl("http://p2.so.qhimgs1.com/bdr/326__/t011d6de038ad0b20b2.jpg");


        PriceEntity priceEntity1 = new PriceEntity();
        priceEntity1.setBingoTimesStr("测试1");
        priceEntity1.setAwardItemName("白菜");
        priceEntity1.setAwardName("111111000");
        priceEntity1.setRewardCoinNum("明细");
        priceEntity1.setImageUrl("http://p2.so.qhimgs1.com/bdr/326__/t011d6de038ad0b20b2.jpg");


        PriceEntity priceEntity2 = new PriceEntity();
        priceEntity2.setBingoTimesStr("测试1");
        priceEntity2.setAwardItemName("白菜");
        priceEntity2.setAwardName("111111000");
        priceEntity2.setRewardCoinNum("明细");
        priceEntity2.setImageUrl("http://p2.so.qhimgs1.com/bdr/326__/t011d6de038ad0b20b2.jpg");


        PriceEntity priceEntity3 = new PriceEntity();
        priceEntity3.setBingoTimesStr("测试1");
        priceEntity3.setAwardItemName("白菜");
        priceEntity3.setAwardName("111111000");
        priceEntity3.setRewardCoinNum("明细");
        priceEntity3.setImageUrl("http://p2.so.qhimgs1.com/bdr/326__/t011d6de038ad0b20b2.jpg");

        listDatas.add(priceEntity);
        listDatas.add(priceEntity1);
        listDatas.add(priceEntity2);
        listDatas.add(priceEntity3);


        MyDialog.getInstance().shownDialogListImage(this, listDatas, "我的竞猜");
    }


    //加载中对话框
    public void shown11(View view) {
        MyDialog.getInstance().shownDialogLoad(this, "加载中...");
    }

    public void shown12(View view) {
        MyDialog.getInstance().shownDialogMum(this, "加载中...");
    }

    /**
     * -----------------------------------------------
     */
    //底部对话框
    public void shown5(View view) {
        List<String> list = new ArrayList<>();
        list.add("交易记录");
        list.add("支付管理");
        list.add("支付安全");
        list.add("帮助中心");

        MyDialog.getInstance().showPopWindow(this, list, "更多管理");
    }

    public void shown6(View view) {
        final List<String> listText = new ArrayList<>();
        List<Integer> listIcon = new ArrayList<>();
        listText.add("微信好友");
        listText.add("微信朋友圈");
        listText.add("微信收藏");
        listText.add("QQ好友");
        listText.add("QQ空间");
        listText.add("新浪微博");

        listIcon.add(R.mipmap.pengyouquan);
        listIcon.add(R.mipmap.qq);
        listIcon.add(R.mipmap.qqkongjian);
        listIcon.add(R.mipmap.weixin);
        listIcon.add(R.mipmap.weixinshoucang);
        listIcon.add(R.mipmap.xinlangweibo);

        MyDialog.getInstance().showPopWindowIcon(this, listText, listIcon);
    }


    //普通Toast
    public void shownToast1(View view) {
        MyToast.getInstance().shownToast(this, "普通Toast");
    }

    //自定义Toast
    public void shownToast2(View view) {
        MyToast.getInstance().showToastShape(this, "+100");
    }


    //自定义Toast
    public void shownToast13(View view) {
        MyToast.getInstance().showToastShapeAnimation(this);
    }

    public void shown7(View view) {
        MyToast.getInstance().showToastButton(this, "登录成功登录成功登录成功\n登录成功");
    }


    //仿ISO的Dialog
    public void shown8(View view) {
        //带editText
        MyDialog.getInstance().shownIosDialogEditText(this, "充值", "自定义充值其他金额");

    }

    public void shown9(View view) {
        //普通对话框
        MyDialog.getInstance().shownIosDialog(this, "拨打电话", "1325255");

    }


}
