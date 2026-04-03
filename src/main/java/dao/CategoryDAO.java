package dao;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
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

    /*
     * Inserts a new category into the database.
     * It takes a Category object as input and uses a PreparedStatement to execute the SQL INSERT statement.
     * If the insertion is successful, it returns true; otherwise, it returns false.
     */
    public boolean insertCategory(Category object) {
        String sql = "INSERT INTO categories (id, name) VALUES (?, ?)";
        try (Connection connection = ConnectionDB.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, object.getIdCategory());
            preparedStatement.setString(2, object.getName());
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println("Error adding category: " + e.getMessage());
            return false;
        }
    }

    /*
     * Deletes a category from the database based on its ID.
     * It uses a PreparedStatement to execute the SQL DELETE statement.
     * If the deletion is successful, it returns true; otherwise, it returns false.
     */
    public boolean deleteCategory(int id) {
        String sql = "DELETE FROM categories WHERE id = ?";
        try (Connection connection = ConnectionDB.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println("Error deleting category: " + e.getMessage());
            return false;
        }
    }
}