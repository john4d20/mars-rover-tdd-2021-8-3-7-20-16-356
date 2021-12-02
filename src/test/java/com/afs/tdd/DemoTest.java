package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_locationY_add_one_space_when_execute_command_given_direction_N_and_command_M() {
//        given
        MarsRover marsRover = new MarsRover(0,0,"N");
        String command = "M";

//        when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

//        then
        assertEquals("0 1 N",result);

    }

    @Test
    void should_locationX_add_one_space_when_execute_command_given_direction_N_and_command_M() {
//        given
        MarsRover marsRover = new MarsRover(0,0,"N");
        String command = "M";

//        when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

//        then
        assertEquals("1 0 N",result);

    }
}
