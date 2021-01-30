package com.my.designpattern.viewmodel;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import com.my.designpattern.BR;
import com.my.designpattern.model.ModelFactory;

public class ViewmodelFactory extends BaseObservable {


    public String textN;


    public ViewmodelFactory(ModelFactory model) {
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
