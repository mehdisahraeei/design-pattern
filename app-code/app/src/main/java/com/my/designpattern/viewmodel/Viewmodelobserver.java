package com.my.designpattern.viewmodel;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.my.designpattern.BR;
import com.my.designpattern.model.Modelobserver;

public class Viewmodelobserver extends BaseObservable {

    public String textN;

    public Viewmodelobserver(Modelobserver model) {
        this.textN = model.textN;
    }


    @Bindable
    public String getTextN() {
        return textN;
    }

    public void setTextN(String textN) {
        this.textN = textN;
        notifyPropertyChanged(BR.textN);
    }
}
