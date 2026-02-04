package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class App7 {
    public static void main(String[] args) throws IllegalAccessException {
        Person p = new Person(1, "Maria");
        var theClass = Person.class;

        for (Field f : theClass.getDeclaredFields()) {
            f.setAccessible(true);
            System.out.println("Name: " + f.getName());
            System.out.println("Tipo: " + f.getType().getName());
            System.out.println("publico? " + Modifier.isPublic(f.getModifiers()));
            System.out.println("Valor: " + f.get(p));
            System.out.println();
        }
    }
}
