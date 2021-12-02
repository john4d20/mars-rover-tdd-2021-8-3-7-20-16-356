package com.afs.tdd;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_locationY_add_one_space_when_execute_command_given_direction_N_and_command_M() {

        MarsRover marsRover = new MarsRover(0,0,"N");
        String commands = "M";


        marsRover.executeCommands(commands);
        String result = marsRover.getStatus();


        assertEquals("0 1 N",result);

    }

    @Test
    void should_locationX_add_one_space_when_execute_command_given_direction_E_and_command_M() {

        MarsRover marsRover = new MarsRover(0,0,"E");
        String commands = "M";


        marsRover.executeCommands(commands);
        String result = marsRover.getStatus();


        assertEquals("1 0 E",result);

    }

    @Test
    void should_locationY_minus_one_space_when_execute_command_given_direction_S_and_command_M() {

        MarsRover marsRover = new MarsRover(0,0,"S");
        String commands = "M";




        marsRover.executeCommands(commands);
        String result = marsRover.getStatus();


        assertEquals("0 -1 S",result);

    }

    @Test
    void should_locationX_minus_one_space_when_execute_command_given_direction_W_and_command_M() {

        MarsRover marsRover = new MarsRover(0,0,"W");
        String commands = "M";




        marsRover.executeCommands(commands);
        String result = marsRover.getStatus();


        assertEquals("-1 0 W",result);

    }

    @Test
    void should_direction_turn_to_W_when_execute_command_given_direction_N_and_command_L() {

        MarsRover marsRover = new MarsRover(0,0,"N");
        String commands = "L";




        marsRover.executeCommands(commands);
        String result = marsRover.getStatus();


        assertEquals("0 0 W",result);

    }

    @Test
    void should_direction_turn_to_S_when_execute_command_given_direction_W_and_command_L() {

        MarsRover marsRover = new MarsRover(0,0,"W");
        String commands = "L";




        marsRover.executeCommands(commands);
        String result = marsRover.getStatus();


        assertEquals("0 0 S",result);

    }

    @Test
    void should_direction_turn_to_E_when_execute_command_given_direction_S_and_command_L() {

        MarsRover marsRover = new MarsRover(0,0,"S");
        String commands = "L";




        marsRover.executeCommands(commands);
        String result = marsRover.getStatus();


        assertEquals("0 0 E",result);

    }

    @Test
    void should_direction_turn_to_N_when_execute_command_given_direction_E_and_command_L() {

        MarsRover marsRover = new MarsRover(0,0,"E");
        String commands = "L";




        marsRover.executeCommands(commands);
        String result = marsRover.getStatus();


        assertEquals("0 0 N",result);

    }

    @Test
    void should_direction_turn_to_E_when_execute_command_given_direction_N_and_command_R() {

        MarsRover marsRover = new MarsRover(0,0,"N");
        String commands = "R";




        marsRover.executeCommands(commands);
        String result = marsRover.getStatus();


        assertEquals("0 0 E",result);

    }

    @Test
    void should_direction_turn_to_N_when_execute_command_given_direction_W_and_command_R() {

        MarsRover marsRover = new MarsRover(0,0,"W");
        String commands = "R";




        marsRover.executeCommands(commands);
        String result = marsRover.getStatus();


        assertEquals("0 0 N",result);

    }

    @Test
    void should_direction_turn_to_W_when_execute_command_given_direction_S_and_command_R() {
        MarsRover marsRover = new MarsRover(0,0,"S");
        String commands = "R";




        marsRover.executeCommands(commands);
        String result = marsRover.getStatus();


        assertEquals("0 0 W",result);

    }

    @Test
    void should_direction_turn_to_S_when_execute_command_given_direction_E_and_command_R() {

        MarsRover marsRover = new MarsRover(0,0,"E");
        String commands = "R";


        marsRover.executeCommands(commands);
        String result = marsRover.getStatus();


        assertEquals("0 0 S",result);

    }

    @Test
    void should_be_locationX_negative1_locationY_1_direction_N_when_execute_command_given_direction_N_locationX_0_location_Y_0_and_command_MLMR() {

        MarsRover marsRover = new MarsRover(0,0,"N");
        String commands = "MLMR";
        marsRover.executeCommands(commands);
        String result = marsRover.getStatus();


        assertEquals("-1 1 N",result);

    }
}
