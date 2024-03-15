package com.example.a15_03_2024_baitap2;

import androidx.databinding.Bindable;

import java.io.Serializable;

public class User implements Serializable {
    private int stt;
    private String firstName;
    private String lastName;

    public User(int stt, String firstName, String lastName) {
        this.stt = stt;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public int getStt()
    {
        return stt;
    }
    public void setStt(int stt)
    {
        this.stt = stt;
    }

    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
}
