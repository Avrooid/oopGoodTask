package ru.oop;

public class DiscordBot extends AbstractChatBot {
    @Override
    public void sendMessage(String message) {
        System.out.print("DiscordBot: ");
        super.sendMessage(message);
    }

    @Override
    public void start() {
        System.out.println("DiscordBot запущен, введите stop для остановки");
        super.start();
        System.out.println("DiscordBot остановлен");
    }
}
