package reflection;

public class Dog implements Animal {
    public void afterContrutor_(){
        System.out.println("afterContrutor()");
    }
    @Override
    public void speek() {
        System.out.println("Au AU");
    }
}
