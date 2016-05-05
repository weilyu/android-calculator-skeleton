package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract extends Calc {
    public Subtract(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public int operate() {
        return getNum1() - getNum2();
    }
}
