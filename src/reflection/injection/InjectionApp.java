package reflection.injection;

public class InjectionApp {
    public static void main(String[] args) {

//        Circle circle = Factory.create(Circle.class);
//        circle.setRadius(10);
//        System.out.println(circle.calculateSurface());

        RandomGebereitor gen = Factory.create(RandomGebereitor.class);

        for (int i = 0; i < 10; i++) {
            System.out.println(gen.next());
        }

    }

}
