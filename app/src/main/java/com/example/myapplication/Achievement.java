/**
 * Name: Brian Beeby
 * Project: IdleIdol
 * Task: Achievement object class
 * Date: 10/23/19
 */

package com.example.myapplication;  // Package and imports copy-pasted from Achievements

public enum Achievement     // Using the Java enum class
{
    // 5 sample achievements
    SAMPLE_1(
            "Sample 1",
            "This is a sample achievement",
            R.drawable.rename_image,
            100,
            100,
            100
    ) {

        @Override
        public boolean shouldUnlock(Object... args)
        {
            // Let's pretend this achievement requires a certain amount of coins
            int coins = ((Integer) args[0]).intValue(); // notice the unsafe cast
            return coins > 500;
        }
    },

    SAMPLE_2(
            "Sample 2",
            "This is a sample achievement",
            R.drawable.rename_image,
            300,
            20,
            150
    ) {

        @Override
        public boolean shouldUnlock(Object... args)
        {
            // Let's pretend this achievement requires a certain amount of coins
            int coins = ((Integer) args[0]).intValue(); // notice the unsafe cast
            return coins > 500;
        }
    },

    SAMPLE_3(
            "Sample 3",
            "This is a sample achievement",
            R.drawable.rename_image,
            250,
            145,
            501
    ) {

        @Override
        public boolean shouldUnlock(Object... args)
        {
            // Let's pretend this achievement requires a certain amount of coins
            int coins = ((Integer) args[0]).intValue(); // notice the unsafe cast
            return coins > 500;
        }
    },

    SAMPLE_4(
            "Sample 4",
            "This is a sample achievement",
            R.drawable.rename_image,
            409,
            397,
            201
    ) {

        @Override
        public boolean shouldUnlock(Object... args)
        {
            // Let's pretend this achievement requires a certain amount of coins
            int coins = ((Integer) args[0]).intValue(); // notice the unsafe cast
            return coins > 500;
        }
    },

    SAMPLE_5(
            "Sample 5",
            "This is a sample achievement",
            R.drawable.rename_image,
            520,
            5,
            32
    ) {

        @Override
        public boolean shouldUnlock(Object... args)
        {
            // Let's pretend this achievement requires a certain amount of coins
            int coins = ((Integer) args[0]).intValue(); // notice the unsafe cast
            return coins > 500;
        }
    };

    public final String title;
    public final String description;

    /**
     * Res ID for icon
     */
    public final int imageDrawable;

    /**
     * The amount of exp earned for unlocking this achievement
     */
    public final int exp;
    /**
     * The amount of money earned for unlocking this achievement
     */
    public final int money;
    /**
     * The amount of seeds earned for unlocking this achievement
     */
    public final int seeds;

    /**
     * This achievement can be unlocked
     */
    private boolean visible;
    /**
     * This achievement has been unlocked
     */
    private boolean unlocked;

    Achievement(String title, String description, int imageDrawable, int exp, int money, int seeds)
    {
        this.title = title;
        this.description = description;
        this.imageDrawable = imageDrawable;
        this.exp = exp;
        this.money = money;
        this.seeds = seeds;
        this.visible = false;
        this.unlocked = false;
    }

    /*
     * Friendly note from Jose:
     *  This is a generally dangerous way of trying to do this, but it allows flexibility
     *  in what it means for an achievement to be unlocked. However, validation for argument type
     *  and ordering needs to be done in each individual override!
     */

    /**
     * Test whether this achievement can be unlocked
     * @param args Whatever parameters are needed for this specific achievement
     * @return
     */
    public abstract boolean shouldUnlock(Object... args);

    /**
     * isVisible
     * @return true if achievement is claimed; hence visible
     */
    public boolean isVisible()
    {
        return visible;
    }

    /**
     * isUnlocked
     * @return true if achievement is unlocked
     */
    public boolean isUnlocked()
    {
        return unlocked;
    }
}