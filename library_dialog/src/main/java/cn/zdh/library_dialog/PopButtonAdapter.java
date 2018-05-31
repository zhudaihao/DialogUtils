package cn.zdh.library_dialog;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2018/1/11.
 */

public class PopButtonAdapter extends ListItemAdapter<String> {
    public PopButtonAdapter(Context context, List<String> list) {
        super(context, list);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = View.inflate(mContext, R.layout.item_pop_bottom, null);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.textView.setText(mList.get(i));
        return view;
    }


    public static class ViewHolder {
        private TextView textView;

        public ViewHolder(View view) {
            textView = view.findViewById(R.id.tv_text);


        }


    }

}
