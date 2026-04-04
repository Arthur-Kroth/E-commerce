package dao;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import model.Product;

public class ProductDAO {

    /*
     * Returns a list of all products from the database.
     * It establishes a connection, executes a SQL query to fetch all products,
     * and populates an ArrayList with Product objects created from the result set.
     * If any exceptions occur during this process,
     *  it catches them and prints an error message.
     * Finally, it returns the list of products.
     */
    public ArrayList<Product> mylist = new ArrayList<>();

    public ArrayList<Product> getAllProducts() {
        mylist.clear();
        try (Connection connection = ConnectionDB.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM products")) {

            while (resultSet.next()) {
                int idProduct = resultSet.getInt("idProduct");
                String name = resultSet.getString("name");
                double unit_price = resultSet.getDouble("unit_price");
                int quantity_stock = resultSet.getInt("quantity_stock");
                int quantity_min = resultSet.getInt("quantity_min");
                int quantity_max = resultSet.getInt("quantity_max");
                int idCategory = resultSet.getInt("idCategory");
                Product product = new Product(idProduct, name, unit_price,
                                              quantity_stock, quantity_min,
                                              quantity_max, idCategory);
                mylist.add(product);
            }
        } catch (SQLException e) {
            System.out.println("Error fetching products: " + e.getMessage());
        }
        return mylist;
    }

    /*
     * Inserts a new product into the database.
     * It takes a Product object as input and uses a PreparedStatement to execute the INSERT query.
     * If the insertion is successful, it returns true; otherwise, it returns false.
     */
    public boolean insertProduct(Product object) {
        String sql = "INSERT INTO products (idProduct, name, unit_price, quantity_stock,"
                   + " quantity_min, quantity_max, idCategory) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = ConnectionDB.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, object.getIdProduct());
            preparedStatement.setString(2, object.getName());
            preparedStatement.setDouble(3, object.getUnit_price());
            preparedStatement.setInt(4, object.getQuantity_stock());
            preparedStatement.setInt(5, object.getQuantity_min());
            preparedStatement.setInt(6, object.getQuantity_max());
            preparedStatement.setInt(7, object.getIdCategory());
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println("Error adding product: " + e.getMessage());
            return false;
        }
    }

    /*
     * Deletes a product from the database based on its ID.
     * It uses a PreparedStatement to execute the DELETE query.
     * If the deletion is successful, it returns true; otherwise, it returns false.
     */
    public boolean deleteProduct(int id) {
        String sql = "DELETE FROM products WHERE idProduct = ?";
        try (Connection connection = ConnectionDB.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println("Error deleting product: " + e.getMessage());
            return false;
        }
    }

    /*
     * Updates an existing product in the database.
     * It takes a Product object as input and uses a PreparedStatement to execute the UPDATE query.
     * If the update is successful, it returns true; otherwise, it returns false.
     */
    public boolean updateProduct(Product object) {
        String sql = "UPDATE products SET name = ?, unit_price = ?, quantity_stock = ?,"
                   + " quantity_min = ?, quantity_max = ?, idCategory = ? WHERE idProduct = ?";
        try (Connection connection = ConnectionDB.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, object.getName());
            preparedStatement.setDouble(2, object.getUnit_price());
            preparedStatement.setInt(3, object.getQuantity_stock());
            preparedStatement.setInt(4, object.getQuantity_min());
            preparedStatement.setInt(5, object.getQuantity_max());
            preparedStatement.setInt(6, object.getIdCategory());
            preparedStatement.setInt(7, object.getIdProduct());
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println("Error updating product: " + e.getMessage());
            return false;
        }
    }
}