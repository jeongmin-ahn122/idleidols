package com.example.myapplication;

import android.app.Application;

public class Agency extends Application {

    private int curCurrency;
    private int totalCurrency;
    private int curSeeds;
    private int totalSeeds;
    private int level;
    private String agencyName;
    private Idol[] idols;
    private int curNumOfIdols;
    private int maxNumOfIdols;
    private int expNeededToLevelUp;
    private int curExp;

    private final int EXP_LEVEL_MODIFIER = 100;

    public void SetCurrency(int currency)
    {
        this.curCurrency = currency;
    }

    public int GetCurrentCurrency()
    {
        return curCurrency;
    }

    public void SetTotalCurrency(int currency){this.totalCurrency = currency;}

    public int GetTotalCurrency(){return totalCurrency;}

    public void SetSeeds(int seeds)
    {
        this.curSeeds = seeds;
    }

    public int GetCurrentSeeds()
    {
        return curSeeds;
    }

    public void SetTotalSeeds(int seeds){this.totalSeeds = seeds;}

    public int GetTotalSeeds(){return totalSeeds;}

    public void SetLevel(int level)
    {
        this.level = level;
    }

    public int GetLevel()
    {
        return level;
    }

    public void SetName(String agencyName)
    {
        this.agencyName = agencyName;
    }

    public String GetName()
    {
        return agencyName;
    }

    public Idol[] GetIdols() { return this.idols; }

    public int GetCurNumOfIdols(Idol[] idols)
    {
        return idols.length;
    }

    public void SetMaxNumOfIdols(int maxNumOfIdols)
    {
        this.maxNumOfIdols = maxNumOfIdols;
    }

    public int GetMaxNumOfIdols()
    {
        return this.maxNumOfIdols;
    }

    public void SetCurrentExp(int exp)
    {
        this.curExp = exp;
    }

    public int GetCurrentExp()
    {
        return this.curExp;
    }

    public void SetExpNeededToLevel(int level)
    {
        this.expNeededToLevelUp += level * EXP_LEVEL_MODIFIER;
    }

    public int GetExpNeededToLevel()
    {
        return this.expNeededToLevelUp;
    }

}
