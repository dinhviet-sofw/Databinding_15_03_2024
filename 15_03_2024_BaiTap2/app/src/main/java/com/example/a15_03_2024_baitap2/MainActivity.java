package com.example.a15_03_2024_baitap2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableField;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.a15_03_2024_baitap2.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public ObservableField<String> title = new ObservableField<>();
    private ListUserAdapter listUserAdapter;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        title.set("Ví dụ về DataBinding cho RecyleView");
        binding.setHome(this);
        setData();
        binding.rcView.setLayoutManager(new LinearLayoutManager(this));
        binding.rcView.setAdapter(listUserAdapter);
    }
    private void setData() {
        List<User> userList = new ArrayList<>();
        for(int i =0;i<userList.size();i++)
        {
            User user = new User(0,"Đình","Việt");
            user.setFirstName("Đình" + i);
            user.setLastName("Việt" + i);
            userList.add(user);
        }
        listUserAdapter = new ListUserAdapter(userList);
    }
}