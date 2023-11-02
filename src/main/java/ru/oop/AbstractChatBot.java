package ru.oop;

public abstract class AbstractChatBot implements MessageHandler {
    public void start() {
        while (true) {
            String str = getMessage();
            if (str.equals("stop"))
                break;
            sendMessage(str);
        }
    }
}
