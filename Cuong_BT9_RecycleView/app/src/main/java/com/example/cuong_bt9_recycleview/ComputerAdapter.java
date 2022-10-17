package com.example.cuong_bt9_recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ComputerAdapter extends  RecyclerView.Adapter<ComputerAdapter.ComputerViewHolder>{
    private Context mContext;
    private List<Computer> mListComputer;

    public ComputerAdapter(Context mContext) {
        this.mContext = mContext;
    }
    public void setData(List<Computer> list){
        this.mListComputer = list;
        notifyDataSetChanged();

    }


    @NonNull
    @Override
    public ComputerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_computer, parent, false);

        return new ComputerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ComputerViewHolder holder, int position) {
        Computer computer = mListComputer.get(position);
        if(computer ==null){
            return;
        }
        holder.imgComputer.setImageResource(computer.getResourceId());
        holder.txtName.setText(computer.getName());
    }

    @Override
    public int getItemCount() {
        if (mListComputer != null){
            return mListComputer.size();
        }
        return 0;
    }

    public  class ComputerViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgComputer;
        private TextView txtName;
        public ComputerViewHolder(@NonNull View itemView) {
            super(itemView);
            imgComputer= itemView.findViewById(R.id.img_computer);
            txtName = itemView.findViewById(R.id.tv_name);

        }
    }
}
