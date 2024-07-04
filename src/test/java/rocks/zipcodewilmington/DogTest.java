package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void newDogTest(){
        Date date = new Date();
        Dog dog = new Dog("freak", null, 2);
        String name = "freak";
        Date birthDateExpected = null;
        Integer idNumber = 2;
        Assert.assertEquals(name, dog.getName());
        Assert.assertEquals(birthDateExpected,null);
        Assert.assertEquals(idNumber, dog.getId());
    }

    @Test
    public void getSpeak(){
        Dog dog = new Dog();
        String speak = "bark!";
        Assert.assertEquals(dog.speak(),speak);
    }

    @Test
    public void getBirthDate(){
        Dog dog = new Dog();
        Date date = new Date();
        dog.setBirthDate(date);
        Assert.assertEquals(date, dog.getBirthDate());
    }

//    @Test
//    public void getFood() {
//        Dog dog = new Dog();
//        Food cookies = null;
//        Food food = cookies;
//        dog.eat(cookies);
//        Assert.assertEquals(1, dog.getNumberOfMealsEaten(), 0.5);

//    }

        @Test
    public void getFood() {
            Dog dog = new Dog("moka", null, null);
            Food cookies = new Food();
            dog.eat(cookies);
            Integer eaten = dog.getNumberOfMealsEaten();
            Assert.assertEquals(1, eaten, 0.5);
        }

    @Test
    public void getId(){
        Dog dog = new Dog(null, null, 2);
        Integer idExpected = 2;
        Assert.assertEquals(idExpected, dog.getId());
    }

    @Test
    public void inheritanceAnimal(){
        Dog dog = new Dog();
        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void inheritanceMammal(){
        Dog dog = new Dog();
        Assert.assertTrue(dog instanceof Mammal);
    }
}
