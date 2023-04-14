/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moi;

/**
 *
 * @author ADMIN
 */
public class MoveableCircle implements Moveable{
    int radius;
    MoveablePoint center;

    public MoveableCircle(int radius, MoveablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public String toString() {
        return "MoveableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }
}