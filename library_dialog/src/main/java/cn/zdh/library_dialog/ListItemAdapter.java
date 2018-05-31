package cn.zdh.library_dialog;

import android.content.Context;
import android.widget.BaseAdapter;

import java.util.List;

public abstract class ListItemAdapter<T> extends BaseAdapter {

    protected List<T> mList;
    protected Context mContext;

    public List<T> getmList() {
        return mList;
    }

    public void setmList(List<T> mList) {
        this.mList = mList;
        this.notifyDataSetChanged();
    }

    public Context getmContext() {
        return mContext;
    }

    public void setmContext(Context mContext) {
        this.mContext = mContext;
    }

    public ListItemAdapter(Context context, List<T> list) {
        mList = list;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public T getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

}
