package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic
        implements LogicInterface {
    private static final int ADD = 1;
    private static final int SUBTRACT = 2;
    private static final int MULTIPLY = 3;
    private static final int DIVIDE = 4;
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation) {
        Calc calc;
        if (operation == ADD) {
            calc = new Add(argumentOne, argumentTwo);
            mOut.print(String.valueOf(calc.operate()));
        }
        if (operation == SUBTRACT) {
            calc = new Subtract(argumentOne, argumentTwo);
            mOut.print(String.valueOf(calc.operate()));
        }
        if (operation == MULTIPLY) {
            calc = new Multiply(argumentOne, argumentTwo);
            mOut.print(String.valueOf(calc.operate()));
        }
        if (operation == DIVIDE) {
            if (argumentTwo == 0) {
                mOut.print("Cannot be divided by 0!");
                return;
            }
            calc = new Divide(argumentOne, argumentTwo);
            mOut.print(String.valueOf(calc.operate()));
        }
    }
}
