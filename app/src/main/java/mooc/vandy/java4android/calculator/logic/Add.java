package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add extends Calc {
    public Add(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public int operate() {
        return getNum1() + getNum2();
    }
}
