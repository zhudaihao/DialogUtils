package cn.zdh.library_dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;


/**
 * Created by Administrator on 2017/5/9.
 */
public class GridViewAdapter extends BaseAdapter {
    private Context context;
    private List<PriceEntity> lists;//数据源
    private int mIndex; // 页数下标，标示第几页，从0开始
    private int max;// 每页显示的最大的数量


    public GridViewAdapter(Context context, List<PriceEntity> lists, int mIndex, int max) {
        this.context = context;
        this.lists = lists;
        this.mIndex = mIndex;
        this.max = max;
    }

    /**
     * 先判断数据及的大小是否显示满本页lists.size() > (mIndex + 1)*mPagerSize
     * 如果满足，则此页就显示最大数量lists的个数
     * 如果不够显示每页的最大数量，那么剩下几个就显示几个
     */
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return lists.size() > (mIndex + 1) * max ? max : (lists.size() - mIndex * max);
    }

    @Override
    public PriceEntity getItem(int arg0) {
        // TODO Auto-generated method stub
        return lists.get(arg0 + mIndex * max);
    }

    @Override
    public long getItemId(int arg0) {
        // TODO Auto-generated method stub
        return arg0 + mIndex * max;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        ViewHolder holder = null;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = View.inflate(context, R.layout.gridview_item, null);
            holder.price = (TextView) convertView.findViewById(R.id.price);
            holder.image = (ImageView) convertView.findViewById(R.id.image);
            holder.priceName = (TextView) convertView.findViewById(R.id.priceName);
            holder.session_name = (TextView) convertView.findViewById(R.id.session_name);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        //重新确定position因为拿到的总是数据源，数据源是分页加载到每页的GridView上的
        final int pos = position + mIndex * max;//假设mPageSiez
        //假设mPagerSize=8，假如点击的是第二页（即mIndex=1）上的第二个位置item(position=1),那么这个item的实际位置就是pos=9
        holder.price.setText(lists.get(pos).getAwardItemName());
        //图片
        if (TextUtils.isEmpty(lists.get(pos).getImageUrl())) {
            holder.image.setBackground(context.getResources().getDrawable(R.drawable.xnb_shape));
        } else {
            Glide.with(context).load(lists.get(pos).getImageUrl()).placeholder(R.drawable.xnb_shape).error(R.drawable.xnb_shape).into(holder.image);
        }

        //奖品名称
        if (lists.get(pos).getAwardName().equals("虚拟币")) {
            holder.priceName.setText("" + lists.get(pos).getRewardCoinNum());
        } else {
            holder.priceName.setText(lists.get(pos).getAwardName());
        }


        holder.session_name.setText(lists.get(pos).getBingoTimesStr() + "");


        return convertView;
    }

    static class ViewHolder {
        private TextView price;
        private TextView priceName;
        private TextView session_name;
        private ImageView image;
    }

}

