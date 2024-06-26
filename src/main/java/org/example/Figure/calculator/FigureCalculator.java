package org.example.Figure.calculator;

public interface FigureCalculator<T> {

    double calculateArea(T t);

    double calculatePerimeter(T t);

}