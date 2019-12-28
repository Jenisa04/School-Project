package com.example.ia;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class fwb_adapter extends RecyclerView.Adapter<fwb_adapter.ViewHolder> {

    public interface OnItemClickListener {
        void onItemClick(fwb_item item);
    }

    private final List<fwb_item> items;
    private final OnItemClickListener listener;

    public fwb_adapter(List<fwb_item> items, OnItemClickListener listener) {
        this.items = items;
        this.listener = listener;
    }

    @Override public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fwb_list, viewGroup, false);
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

        public void bind(final fwb_item item, final OnItemClickListener listener) {
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

