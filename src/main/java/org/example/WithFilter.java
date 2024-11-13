package org.example;

public class WithFilter implements Filter{
    @Override
    public Object apply(Object o) {
        if (o instanceof Integer) {
            return (Integer) o + 1;
        } else if (o instanceof Double) {
            return (Double) o + 1.0;
        } else if (o instanceof Float) {
            return (Float) o + 1.0f;
        }
        throw new IllegalArgumentException("Необработанный тип объекта: "
            + o.getClass().getName());
    }
}
