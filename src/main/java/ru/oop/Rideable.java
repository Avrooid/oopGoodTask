package ru.oop;

/**
 * Объект может ездить
 */
public interface Rideable extends Positioned{
    /**
     * Меняет местоположение человека
     */
    void move(Person person);
}
