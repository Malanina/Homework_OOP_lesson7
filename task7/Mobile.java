package task7;

public class Mobile extends Telephone implements  TypeOfConnection, SendMessage, TakeMessage {
    public Mobile(Object speaker, Object microphone, Object communicationModule) {
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
        System.out.println("Сотовая связь");
    }

}
