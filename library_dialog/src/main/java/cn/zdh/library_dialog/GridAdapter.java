package cn.zdh.library_dialog;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/10/12.
 */

public class GridAdapter extends BaseAdapter {
    List<String> list;
    List<Integer> listIcon;
    Context context;

    public GridAdapter(List<String> list, List<Integer> listIcon, Context context) {
        this.list = list;
        this.listIcon = listIcon;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list == null ? 0 : list.size();
    }

    @Override
    public String getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = View.inflate(context, R.layout.item_icon_layout, null);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.tvText.setText(list.get(i));
        viewHolder.icIcon.setBackgroundResource(listIcon.get(i));
        return view;
    }


    static class ViewHolder {
        TextView tvText;
        ImageView icIcon;

        ViewHolder(View view) {
            tvText = view.findViewById(R.id.tv_text);
            icIcon = view.findViewById(R.id.iv_icon);
        }
    }
}
