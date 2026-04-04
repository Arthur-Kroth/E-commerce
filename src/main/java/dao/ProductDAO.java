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
}