package pwCompiler;

import java.util.ArrayList;

/**
 * Created by zz5013 on 12/06/17.
 */
public class Value {

    //public static Value VOID = new Value(new Object());

    private Object value; // could be hashcode, double, Integer, Boolean, valueRange(ArrayList<Integer>), Pair<ArrayList<Object>, ArrayList<Double>>
    private boolean valueKnown;

    public Value() {
        value = null;
        valueKnown = false;
    }


    public void setVarValues(ArrayList<Object> values) {
        value = values;
        valueKnown = false;
    }

    public void setValue(Object value) {
        this.value = value;
        valueKnown = true;
    }

    public Object getValue() {
        return value;
    }

    public boolean valueKnown() { return valueKnown; }

    public boolean valueUnknown() { return !valueKnown; }

}
