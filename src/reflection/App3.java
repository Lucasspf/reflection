package reflection;

public class App3 {
    public static void main(String[] args) throws Exception {
       Animal cat  = Fectory.newAnimal("reflection.Cat");
        cat.speek();

        Animal dog  = Fectory.newAnimal("reflection.Dog");
        dog.speek();

        Animal sheep  = Fectory.newAnimal("reflection.Sheep");
        sheep.speek();

    }
}
