package reflection;

public class App2 {
    public static void main(String[] args) throws Exception {


        Animal a1 = new Cat();
        a1.speek();

        var c = Cat.class;
        var construtor = c.getConstructor();
        Cat cat = construtor.newInstance();
        cat.speek();
    }
}
