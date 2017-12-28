package com.mshoaibnuman.livetracking;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by muhammadirfan on 13/12/2017.
 */

public class ListOnlineViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView tvEmail;
    public ItemClickListenener itemClickListenener;

    public ListOnlineViewHolder(View itemView) {
        super(itemView);

        tvEmail = (TextView) itemView.findViewById(R.id.tvEmail);
        itemView.setOnClickListener(this);
    }

    public void setItemClickListenener(ItemClickListenener itemClickListenener) {
        this.itemClickListenener = itemClickListenener;
    }

    @Override
    public void onClick(View view) {

        itemClickListenener.onClick(view, getAdapterPosition());

    }
}
