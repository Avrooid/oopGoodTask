package ru.oop;

import java.util.Scanner;

public interface MessageHandler {
    default String getMessage() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    };
    default void sendMessage(String message) {
        System.out.println("Ваше сообщение:\"" + message + "\"");
    };
}
