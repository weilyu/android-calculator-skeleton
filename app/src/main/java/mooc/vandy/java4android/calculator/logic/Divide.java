package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide extends Calc {
   public Divide(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public int operate() {
        return getNum1() / getNum2();
    }
}
