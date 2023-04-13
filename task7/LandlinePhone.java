package task7;


public class LandlinePhone extends Telephone implements TypeOfConnection {
    public LandlinePhone(Object speaker, Object microphone, Object phoneDisk) {
        super(speaker, microphone);
    }

    @Override
    public void connection() {
        System.out.println("Телефонная линия");
    }
   
}