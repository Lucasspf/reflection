package reflection;

public class App4 {
    public static void main(String[] args) throws Exception {
       Animal cat  = Fectory.newAnimal("reflection." + args[0]);
        cat.speek();

    }
}
