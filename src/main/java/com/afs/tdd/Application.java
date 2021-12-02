package com.afs.tdd;

import java.util.List;

class MarsRover {
    private int locationX;
    private int locationY;
    private String direction;

    public MarsRover(int locationX, int locationY, String direction){
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }


    private void executeCommand(char command) {
        if (command == ('M')){
            move();
        }
        else if (command == ('L')){
            turnLeft();
        }
        else {
            turnRight();
        }

    }

    private void turnRight() {
        if (this.direction.equals("N")){
            this.direction = "E";
        }
        else if (this.direction.equals("W")){
            this.direction = "N";
        }
        else if (this.direction.equals("S")){
            this.direction = "W";
        }
        else {
            this.direction = "S";
        }
    }

    private void turnLeft() {
        if (this.direction.equals("N")){
            this.direction = "W";
        }
        else if (this.direction.equals("W")){
            this.direction = "S";
        }
        else if (this.direction.equals("S")){
            this.direction = "E";
        }
        else {
            this.direction = "N";
        }
    }

    private void move(){
        if (this.direction.equals("N")){
            this.locationY++;
        }
        else if (this.direction.equals("E")){
            this.locationX++;
        }
        else if (this.direction.equals("S")){
            this.locationY--;
        }
        else {
            this.locationX--;
        }

    }

    public String getStatus(){
        return String.format("%d %d %s",locationX,locationY,direction);
    }

//    public void executeCommands(String commands) {
//        for (char command : commands.toCharArray()){
//            executeCommand(command);
//        }
//    }
}
