package sb.tai;

import java.util.function.DoubleBinaryOperator;

public class Calc {
    public Calc(String digit1, String digit2) throws MyExceptionList {
        try {
            Integer division = 0;
            division = Integer.valueOf(digit1) / Integer.valueOf(digit2);

        } catch (NullPointerException e) {
            throw new MyExceptionList("e1", e);
        } catch (ClassCastException e) {
            throw new MyExceptionList("e2", e);
        } catch (NumberFormatException e) {
            throw new MyExceptionList("e3", e);
        }

    }
}






