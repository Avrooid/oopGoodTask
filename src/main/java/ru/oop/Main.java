package ru.oop;

/**
 * Задача: нужно добраться человеку на машине до заданного места.<br>
 * Но не всегда можно подъехать прямо к нужному месту, может понадобиться дойти пешком.<br>
 * Человек знает своё текущее местоположение (у него есть метод {@link Person#getPosition()}<br>
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
public class Main {

    /**
     * Переехать из текущего места в заданную точку
     */
    public static void moveTo(Person person, Position destination) {
        // TODO
        assert person.getPosition() == destination;
    }
}
