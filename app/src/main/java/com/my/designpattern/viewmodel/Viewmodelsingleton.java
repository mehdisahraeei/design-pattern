package com.my.designpattern.viewmodel;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import com.my.designpattern.BR;
import com.my.designpattern.model.Modelsingleton;

public class Viewmodelsingleton extends BaseObservable {

    public String textN;

    public Viewmodelsingleton(Modelsingleton model) {
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
