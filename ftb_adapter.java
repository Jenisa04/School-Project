package com.example.ia;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class ftb_adapter extends RecyclerView.Adapter<ftb_adapter.ViewHolder> {

    public interface OnItemClickListener {
        void onItemClick(ftb_item item);
    }

    private final List<ftb_item> items;
    private final OnItemClickListener listener;

    public ftb_adapter(List<ftb_item> items, OnItemClickListener listener) {
        this.items=items;
        this.listener = listener;
    }

    @Override public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ftb_list, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(items.get(position), listener);
    }

    @Override public int getItemCount() {
        return items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView thead;
        private TextView tprice;

        public ViewHolder(View itemView) {
            super(itemView);
            thead = (TextView) itemView.findViewById(R.id.text_head);
            tprice = (TextView) itemView.findViewById(R.id.text_price);
        }

        public void bind(final ftb_item item, final OnItemClickListener listener) {
            thead.setText(item.getHead());
            tprice.setText(item.getPrice());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    listener.onItemClick(item);
                }

            });
        }
    }
}

