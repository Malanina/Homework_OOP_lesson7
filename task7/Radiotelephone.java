package task7;

public class Radiotelephone extends Telephone
        implements TypeOfConnection, SendMessage, TakeMessage {
    public Radiotelephone(Object speaker, Object microphone, Object radioModule) {
        super(speaker, microphone);
    }

    @Override
    public void receiveMessage() {
        System.out.println("Отправляется сообщение");
    }

    @Override
    public void acceptMessage() {
        System.out.println("Принимается сообщение");
    }

    @Override
    public void connection() {
        System.out.println("Радиосвязь");
    }

}
