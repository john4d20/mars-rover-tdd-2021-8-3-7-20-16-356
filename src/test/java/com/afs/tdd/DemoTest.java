package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_locationY_add_one_space_when_execute_command_given_direction_N_and_command_M() {

        MarsRover marsRover = new MarsRover(0,0,"N");
        String command = "M";


        marsRover.executeCommand(command);
        String result = marsRover.getStatus();


        assertEquals("0 1 N",result);

    }

    @Test
    void should_locationX_add_one_space_when_execute_command_given_direction_E_and_command_M() {

        MarsRover marsRover = new MarsRover(0,0,"E");
        String command = "M";


        marsRover.executeCommand(command);
        String result = marsRover.getStatus();


        assertEquals("1 0 E",result);

    }

    @Test
    void should_locationY_minus_one_space_when_execute_command_given_direction_S_and_command_M() {

        MarsRover marsRover = new MarsRover(0,0,"S");
        String command = "M";


        marsRover.executeCommand(command);
        String result = marsRover.getStatus();


        assertEquals("0 -1 S",result);

    }

    @Test
    void should_locationX_minus_one_space_when_execute_command_given_direction_W_and_command_M() {

        MarsRover marsRover = new MarsRover(0,0,"W");
        String command = "M";


        marsRover.executeCommand(command);
        String result = marsRover.getStatus();


        assertEquals("-1 0 W",result);

    }

    @Test
    void should_direction_turn_to_W_when_execute_command_given_direction_N_and_command_L() {

        MarsRover marsRover = new MarsRover(0,0,"N");
        String command = "L";


        marsRover.executeCommand(command);
        String result = marsRover.getStatus();


        assertEquals("0 0 W",result);

    }

    @Test
    void should_direction_turn_to_S_when_execute_command_given_direction_W_and_command_L() {

        MarsRover marsRover = new MarsRover(0,0,"W");
        String command = "L";


        marsRover.executeCommand(command);
        String result = marsRover.getStatus();


        assertEquals("0 0 S",result);

    }

    @Test
    void should_direction_turn_to_E_when_execute_command_given_direction_S_and_command_L() {

        MarsRover marsRover = new MarsRover(0,0,"S");
        String command = "L";


        marsRover.executeCommand(command);
        String result = marsRover.getStatus();


        assertEquals("0 0 E",result);

    }

    @Test
    void should_direction_turn_to_N_when_execute_command_given_direction_E_and_command_L() {

        MarsRover marsRover = new MarsRover(0,0,"E");
        String command = "L";


        marsRover.executeCommand(command);
        String result = marsRover.getStatus();


        assertEquals("0 0 N",result);

    }

    @Test
    void should_direction_turn_to_E_when_execute_command_given_direction_N_and_command_R() {

        MarsRover marsRover = new MarsRover(0,0,"N");
        String command = "R";


        marsRover.executeCommand(command);
        String result = marsRover.getStatus();


        assertEquals("0 0 E",result);

    }

    @Test
    void should_direction_turn_to_N_when_execute_command_given_direction_W_and_command_R() {

        MarsRover marsRover = new MarsRover(0,0,"W");
        String command = "R";


        marsRover.executeCommand(command);
        String result = marsRover.getStatus();


        assertEquals("0 0 N",result);

    }

    @Test
    void should_direction_turn_to_W_when_execute_command_given_direction_S_and_command_R() {
        MarsRover marsRover = new MarsRover(0,0,"S");
        String command = "R";


        marsRover.executeCommand(command);
        String result = marsRover.getStatus();


        assertEquals("0 0 W",result);

    }

    @Test
    void should_direction_turn_to_S_when_execute_command_given_direction_E_and_command_R() {

        MarsRover marsRover = new MarsRover(0,0,"E");
        String command = "R";


        marsRover.executeCommand(command);
        String result = marsRover.getStatus();


        assertEquals("0 0 S",result);

    }
}
