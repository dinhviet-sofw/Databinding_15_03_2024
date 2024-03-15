package com.example.a15_03_2024_baitap2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableField;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a15_03_2024_baitap2.databinding.ItemListUserBinding;

import java.util.List;

public class ListUserAdapter extends RecyclerView.Adapter<ListUserAdapter.MyViewHolder> {
    private List<User> userList;
    public ListUserAdapter(List<User> userList)
    {
        this.userList=userList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        ItemListUserBinding itemListUserBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.item_list_user,parent,false);
        return new MyViewHolder(itemListUserBinding);
    }
    @Override
    public void onBindViewHolder(@NonNull ListUserAdapter.MyViewHolder holder, int position)
    {
        holder.setBinding(userList.get(position),position);
    }
    @Override
    public int getItemCount()
    {
        return userList.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        public ObservableField<String> stt = new ObservableField<>();
        public ObservableField<String> firstName = new ObservableField<>();
        public ObservableField<String> lastName = new ObservableField<>();
        private ItemListUserBinding itemListUserBinding;
        public MyViewHolder(ItemListUserBinding itemView) {
            super(itemView.getRoot());
            this.itemListUserBinding = itemView;
        }
        public void setBinding(User user, int position)
        {
            if(itemListUserBinding.getViewHolder() == null)
            {
                itemListUserBinding.setViewHolder(user);
            }
            stt.set(String.valueOf(position));
            firstName.set(user.getFirstName());
            lastName.set(user.getLastName());
        }
    }
}
