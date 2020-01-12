package Util;

import java.lang.reflect.Field;

public abstract class Printable {
    public String getAllValues() throws IllegalAccessException {
        Field[] allFields = this.getClass().getDeclaredFields();
        String s = "";
        for (Field f : allFields) {
            f.setAccessible(true);
            s += f.getName() + " = " + f.get(this) + "\n";
        }
        return s;
    }
}
