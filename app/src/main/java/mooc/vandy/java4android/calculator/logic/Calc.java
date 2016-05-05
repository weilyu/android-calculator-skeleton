package mooc.vandy.java4android.calculator.logic;

/**
 * Created by edwinlyu on 5/5/16.
 */
public abstract class Calc {
    private int num1;
    private int num2;

    public Calc(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public abstract int operate();
}
