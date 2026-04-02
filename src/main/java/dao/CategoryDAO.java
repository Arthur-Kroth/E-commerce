package dao;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import model.Category;

public class CategoryDAO {

    /*
     * Returns a list of all categories from the database.
     * It establishes a connection, executes a SQL query to fetch all categories,
     * and populates an ArrayList with Category objects created from the result set.
     * If any exceptions occur during this process, it catches them and prints an error message.
     * Finally, it returns the list of categories.
     */
    public ArrayList<Category> mylist = new ArrayList<>();

    public ArrayList<Category> getAllCategories() {
        mylist.clear();
        try (Connection connection = ConnectionDB.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM categories")) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Category category = new Category(id, name);
                mylist.add(category);
            }
        } catch (Exception e) {
            System.out.println("Error fetching categories: " + e.getMessage());
        }
        return mylist;
    }
}