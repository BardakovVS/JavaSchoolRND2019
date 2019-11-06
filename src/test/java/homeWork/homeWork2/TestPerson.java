package homeWork.homeWork2;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testMarry01(){
        Person personIvan = new Person(true, "Ivan");
        Person personMary = new Person(false, "Mary");
        personIvan.marry(personMary);
        Assert.assertEquals(personIvan.getSpouse(), personMary);
    }

    @Test
    public void testMarry02(){
        Person personIvan = new Person(true, "Ivan");
        Person personMary = new Person(false, "Mary");
        personIvan.marry(personMary);
        Assert.assertTrue(personMary.marry(personIvan));
    }

    @Test
    public void testMarry03(){
        Person personIvan = new Person(true, "Ivan");
        Person personPavel = new Person(true, "Pavel");
        Assert.assertFalse(personPavel.marry(personIvan));
    }

    @Test
    public void testDivorce(){
        Person personIvan = new Person(true, "Ivan");
        Person personMary = new Person(false, "Mary");
        personIvan.marry(personMary);
        Assert.assertEquals(personIvan.getSpouse(), personMary);
        Assert.assertTrue(personIvan.divorce());
        Assert.assertFalse(personMary.divorce());
    }

}
