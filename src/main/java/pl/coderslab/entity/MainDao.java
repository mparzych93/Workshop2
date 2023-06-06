package pl.coderslab.entity;

import java.util.Arrays;

public class MainDao {
    public static void main(String[] args) {

        UserDao userDao = new UserDao();

        //creating user
        User userToAdd = new User();
        userToAdd.setUsername("mateusz");
        userToAdd.setEmail("mateusz@gmail.com");
        userToAdd.setPassword("slabe");
        userDao.create(userToAdd);

        //reading user
        User userToRead = userDao.read(2);
        System.out.println(userToRead);

        //updating user
        User userToUpdate = userDao.read(1);
        userToUpdate.setUsername("Arkadiusz");
        userToUpdate.setEmail("arek@coderslab.pl");
        userToUpdate.setPassword("superPassword");
        userDao.update(userToUpdate);

        //deleting user
        userDao.delete(1);

        //finding all users
        User[] arrOfUsers = userDao.findAll();
        System.out.println(Arrays.toString(arrOfUsers));
    }
}
