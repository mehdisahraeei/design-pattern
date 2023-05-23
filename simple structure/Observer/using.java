

    public void ClickL(View view)
    {
        //------observer--used-----
        Calculation calculation=new Calculation();
        Total total=new Total(calculation,context);
        Subtraction subtraction=new Subtraction(calculation,context);
        calculation.setParametr(10,5);
    }
