/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication49;

/**
 *
 * @author georg
 */
class Square
{
    double side;

    Square(double side)
    {
        this.side = side;
    }

    double getArea()
    {
        return side * side;
    }
}
