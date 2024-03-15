package com.example.a15_03_2024_baitap;

import androidx.databinding.Bindable;
import androidx.databinding.BaseObservable;
public class User extends BaseObservable{
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Bindable
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }
    @Bindable
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }
}
