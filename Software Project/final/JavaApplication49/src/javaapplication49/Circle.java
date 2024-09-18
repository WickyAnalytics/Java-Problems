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
class Circle
{
    double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }

    double getArea()
    {
        return (22.0/7.0) * radius * radius;
    }
}
