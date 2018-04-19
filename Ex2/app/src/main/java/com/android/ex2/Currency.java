package com.android.ex2;

/**
 * Created by bum on 4/18/18.
 */

public class Currency {
    public static int USD = 0;
    public static int EUR = 1;
    public static int VND = 2;
    public static int YEN = 3;
    public static int GBP = 4;
    public static int BAHT = 5;
    public static int PHP = 6;
    public static int CNY = 7;
    public static int INR = 8;
    public static int RUP = 9;
    public static int KRW = 10;
    public static int HKD = 11;
    public static int CAD = 12;
    public static int MYR = 13;
    public static int IDR = 14;
    public static int SGD = 15;


    public static String[] currencyName = {"(USD) USA", "(EUR) Euro",
            "(VND) Viet Nam", "(JPY) Jappan", "(GBP) British", "(BAHT) Thailand", "(PHP) Philippines", "(CNY) China",
            "(INR) India","(RUP) Russian","(KRW) Korea","(HKD), HongKong","(CAD) Canada","(MYR) Malaysia"
            ,"(IDR) Indonesia","(SGD) Singapore"};

    //Currency ratio comparing to VND
    public static Double[] currencyRatio = {22769.50, 28069.08, 1.0, 212.26, 32440.16, 728.64, 478.09, 3621.56, 333.91,
            374.15, 21.36, 2900.01, 18006.92, 5856.12, 1.65, 17365.73};
}
