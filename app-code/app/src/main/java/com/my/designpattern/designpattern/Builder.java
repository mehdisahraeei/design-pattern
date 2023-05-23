package com.my.designpattern.designpattern;

import android.content.Context;
import android.widget.Toast;

public class Builder {

    private String firstname, lastname;
    private int Age;

    public Builder(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        Age = age;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", Age=" + Age +
                '}';
    }

    public static class BuilderInto {
        private String firstname, lastname;
        private int Age;
        private Context context;

        public BuilderInto(Context context) {
            this.context = context;
        }

        public BuilderInto(String firstname, String lastname, int age) {
            this.firstname = firstname;
            this.lastname = lastname;
            Age = age;
        }

        public BuilderInto setFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public BuilderInto setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public BuilderInto setAge(int age) {
            Age = age;
            return this;
        }


        public BuilderInto display() {
            Toast.makeText(context, "first name: "+firstname+"\n"+
                    "last name: "+lastname +"\n"+ "age: " + Age, Toast.LENGTH_SHORT).show();
            return this;
        }


        public Builder getthis() {
            return new Builder(firstname, lastname, Age);
        }

    }

}
