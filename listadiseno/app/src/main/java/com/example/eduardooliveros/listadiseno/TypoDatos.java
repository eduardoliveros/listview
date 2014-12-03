package com.example.eduardooliveros.listadiseno;

/**
 * Created by eduardooliverosacosta on 3/12/14.
 */
public class TypoDatos {
    private String Amount;
    private String Date;

    public TypoDatos(String Amount, String Date){
        this.Amount=Amount;
        this.Date=Date;

    }

    public String getAmount() {
        return Amount;
    }


    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
}
