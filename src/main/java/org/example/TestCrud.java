package org.example;

import org.example.crud.CrudSystem;
import org.example.entity.Human;
import java.util.List;

public class TestCrud {

    public static void main(String[] args) {
        CrudSystem humanDAO = new CrudSystem();

        // Create
        Human human = new Human("John", "Doe", 25, "Male", "password123", "john.doe@example.com", "johnny");
        humanDAO.saveHuman(human);

        // Read
        Human retrievedHuman = humanDAO.getHumanById(1L);
        System.out.println("Retrieved: " + retrievedHuman);

        // Update
        retrievedHuman.setAge(30);
        humanDAO.updateHuman(retrievedHuman);

        // Delete
        humanDAO.deleteHuman(1L);

        // List all
        List<Human> humans = humanDAO.getAllHumans();
        humans.forEach(System.out::println);
    }
}
