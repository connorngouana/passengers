package ie.atu.Passengers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest
{
    Passenger myPassenger;

    @BeforeEach
    void setUp()
    {
        myPassenger = new Passenger("mr","connor","G003819888","0873493493",20);
    }
    @Test
    void TestTitle()
    {
        myPassenger.setTitle("mr");
        assertEquals("mr", myPassenger.getTitle());
    }
    @Test
    void testTitleFail()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myPassenger.setTitle("mister");});
        assertEquals("This is not a valid title, title must be mr, ms and mrs", exMessage.getMessage());
    }
    @Test
    void TestName()
    {
        myPassenger.setName("Connor");
        assertEquals("Connor", myPassenger.getName());
    }
    @Test
    void testNameFail()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myPassenger.setName("co");});
        assertEquals("This is not a valid name, name must have minimum 3 characters", exMessage.getMessage());
    }
    @Test
    void TestAge()
    {
        myPassenger.setAge(20);
        assertEquals(20, myPassenger.getAge());
    }
    @Test
    void testAgeFail()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myPassenger.setAge(15);});
        assertEquals("This is not a valid age, you must be 16 plus", exMessage.getMessage());
    }
    @Test
    void TestPhone()
    {
        myPassenger.setPhone("0873493493");
        assertEquals("0873493493", myPassenger.getPhone());
    }
    @Test
    void testPhoneFail()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myPassenger.setPhone("087");});
        assertEquals("This is not a valid number, number must have 7 digits", exMessage.getMessage());
    }
    @Test
    void TestId()
    {
        myPassenger.setId("G003819888");
        assertEquals("G003819888", myPassenger.getId());
    }
    @Test
    void testIdFail()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {myPassenger.setId("G00386");});
        assertEquals("This is not a valid Id, Id must have minimum 10 digits", exMessage.getMessage());
    }

    @AfterEach
    void tearDown()
    {

    }
}