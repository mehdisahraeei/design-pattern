


    public void ClickL(View view)
    {
        //------Builder--used-----

        Builder builder=new Builder.BuilderInto(context).setFirstname("mahdi").
                setLastname("sahrai").setAge(22).display().getthis();

        String result=builder.toString();

    }
