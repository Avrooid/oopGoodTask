package ru.oop;


public class Main {
    public static void main(String[] args) {
        AbstractChatBot chatBot = new DiscordBot();
        chatBot.start();
    }
}
