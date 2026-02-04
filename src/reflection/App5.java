package reflection;

public class App5 {
    public static void main(String[] args) throws Exception {
       Animal animal  = Fectory.newAnimal("reflection.Cat");
       animal.speek();

    }
}
