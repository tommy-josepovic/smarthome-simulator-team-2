package smarthome.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The type Id tests.
 */
public class IdTests {

    /**
     * Id increment test.
     */
    @Test
    public void ID_Increment_Test() {
        User user0 = new User("John", "Parent");
        User user1 = new User("Jack", "Child");
        User user2 = new User("Jill", "Stranger");
        User user3 = new User("Jones", "Guest");

        Room room0 = new Room("Bedroom", null, null, null, 0, 0, 0, 0);
        Room room1 = new Room("Kitchen", null, null, null, 0, 0, 0, 0);
        Room room2 = new Room("Garage", null, null, null, 0, 0, 0, 0);
        Room room3 = new Room("Living Room", null, null, null, 0, 0, 0, 0);

        Window window0 = new Window();
        Window window1 = new Window();
        Window window2 = new Window(false,false);
        Window window3 = new Window(true,false);

        Light light0 = new Light();
        Light light1 = new Light();
        Light light2 = new Light();
        Light light3 = new Light(true);

        Door door0 = new Door();
        Door door1 = new Door(true);
        Door door2 = new Door(false);
        Door door3 = new Door();


        assertEquals(user0.getId() + 1, user1.getId());
        assertEquals(user1.getId() + 1, user2.getId());
        assertEquals(user2.getId() + 1, user3.getId());

        assertEquals(room0.getId() + 1, room1.getId());
        assertEquals(room1.getId() + 1, room2.getId());
        assertEquals(room2.getId() + 1, room3.getId());

        assertEquals(window0.getId() + 1, window1.getId());
        assertEquals(window1.getId() + 1, window2.getId());
        assertEquals(window2.getId() + 1, window3.getId());

        assertEquals(light0.getId() + 1, light1.getId());
        assertEquals(light1.getId() + 1, light2.getId());
        assertEquals(light2.getId() + 1, light3.getId());

        assertEquals(door0.getId() + 1, door1.getId());
        assertEquals(door1.getId() + 1, door2.getId());
        assertEquals(door2.getId() + 1, door3.getId());
    }
}
