package reflection;

public class Fectory {
    public static Animal newAnimal(String className)  throws Exception {
        Class<?> theClass = Class.forName(className);
        var construtor = theClass.getConstructor();
        return (Animal) construtor.newInstance();

    }
}
