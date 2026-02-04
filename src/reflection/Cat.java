package reflection;

public class Cat implements Animal {

    @OnCreated
    private void setup(){
        System.out.println("setup()");
    }
    @OnCreated
    public void setup2(){
        System.out.println("setup()2");
    }
    @Override
    public void speek() {
        System.out.println("miau miau");
    }
}
