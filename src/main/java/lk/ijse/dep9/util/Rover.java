package lk.ijse.dep9.util;

import java.util.ArrayList;
import java.util.List;

public class Rover {
    private int x;
    private int y;
    private String direction;
    private String instructions;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public Rover(int x, int y, String direction, String instructions) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.instructions = instructions;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
