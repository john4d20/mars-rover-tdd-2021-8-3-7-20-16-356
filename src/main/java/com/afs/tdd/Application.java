package com.afs.tdd;

class MarsRover {
    private int locationX;
    private int locationY;
    private String direction;

    public MarsRover(int locationX, int locationY, String direction){
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }


    public void executeCommand(String command) {
        if (command.equals("M")){
            move();
        }
        else if (command.equals("L")){
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
        else if (this.direction.equals("E")){
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
        else if (this.direction.equals("W")){
            this.locationX--;
        }

    }

    public String getStatus(){
        return String.format("%d %d %s",locationX,locationY,direction);
    }
}
