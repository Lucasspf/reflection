package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Fectory {
    public static Animal newAnimal(String className)  throws Exception {
        Class<?> theClass = Class.forName(className);
        var construtor = theClass.getConstructor();
       Animal animal =  (Animal) construtor.newInstance();

        try {
            Method afterContrutorMethod = theClass.getMethod("afterContrutor");
            afterContrutorMethod.invoke(animal);
        }catch (NoSuchMethodException e) {

        }
        Arrays
                .stream(theClass.getDeclaredMethods())
                .forEach(m -> {
                    if (m.getAnnotation(OnCreated.class) != null) {
                        try {
                            m.setAccessible(true);
                            m.invoke(animal);
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            throw new RuntimeException(e);
                        }
                    }
                });

        return animal;

    }
}
