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
        move();
    }

    private void move(){
        if (this.direction == "N"){
            this.locationY++;
        }
        else if (this.direction == "E"){
            this.locationX++;
        }
        else if (this.direction == "S"){
            this.locationY--;
        }
        else if (this.direction == "W"){
            this.locationX--;
        }

    }

    public String getStatus(){
        return String.format("%d %d %s",locationX,locationY,direction);
    }
}
