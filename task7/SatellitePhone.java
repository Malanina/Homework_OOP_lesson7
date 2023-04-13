package task7;

public class SatellitePhone extends Telephone implements  TypeOfConnection, SendMessage, TakeMessage {
    public SatellitePhone(Object speaker, Object microphone, Object antenna) {
        super(speaker, microphone);
    }

    @Override
    public void receiveMessage() {
        System.out.println("Принимается сообщение");
    }

    @Override
    public void acceptMessage() {
        System.out.println("Отправляется сообщение");
    }

    @Override
    public void connection() {
        System.out.println("Спутниковая связь");
    }

}
