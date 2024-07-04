package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

@Test
    public void getDogBirthDAte(){
    Date date = new Date(2002,9,2);
    Dog moke = AnimalFactory.createDog("moka", date);

    Assert.assertEquals(date, moke.getBirthDate());
}

@Test
    public void getDogName(){
    Dog moke = AnimalFactory.createDog("moka", null);
    String name = "moka";
    Assert.assertEquals(name, moke.getName());
}

@Test
    public void getCatBirthDate(){
    Date date = new Date(2002,3,2);
    Cat kitty = AnimalFactory.createCat("stinky", date);
    Assert.assertEquals(date,kitty.getBirthDate());
}
@Test
    public void getCatName(){
    Cat kitty = AnimalFactory.createCat("stinky", null);
    String name = "stinky";
    Assert.assertEquals(name,kitty.getName());
}
}
