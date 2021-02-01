package com.my.designpattern.viewmodel;

import androidx.databinding.BaseObservable;
import com.my.designpattern.model.ModelFacade;


public class ViewmodelFacade extends BaseObservable {

    public String textN;

    public ViewmodelFacade(ModelFacade model) {
        this.textN = model.textN;
    }

    public String getTextN() {
        return textN;
    }

    public void setTextN(String textN) {
        this.textN = textN;
    }
}



