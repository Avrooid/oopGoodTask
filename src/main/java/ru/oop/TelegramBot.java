package ru.oop;

public class TelegramBot extends AbstractChatBot {
    @Override
    public void sendMessage(String message) {
        System.out.print("TelegramBot: ");
        super.sendMessage(message);
    }

    @Override
    public void start() {
        System.out.println("TelegramBot запущен, введите stop для остановки");
        super.start();
        System.out.println("TelegramBot остановлен");
    }
}
