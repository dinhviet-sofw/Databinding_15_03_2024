package com.example.a15_03_2024_baitap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.a15_03_2024_baitap.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private User user;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        user = new User("Viet","Nguyen");
        binding.setUser(user);
//        user.setFirstName("Vinh");
//        user.setLastName("Nguyen");
    }
}