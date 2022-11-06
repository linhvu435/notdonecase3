package dao.user;

import model.Account;
import model.Product;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AccountDao {
    public static Connection connection = ConnectionMySQL.getConnection();
    public static List<Account> accounts = getAll();
    public static List<Account> getAll() {
        String sql = "Select * from account";
        List<Account> accounts = new ArrayList<>();
        try {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String address = resultSet.getString("address");
                LocalDate birthday = resultSet.getDate("birthday").toLocalDate();
                String phonenumber = resultSet.getString("phonenumber");
                int id_role = resultSet.getInt("id_role");
                accounts.add(new Account(id,username,password,address,birthday,phonenumber,id_role));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return accounts;
    }
//    public static void UpdateAccount (Account account) {
//        try {
//            String sql = "UPDATE product set username = ?, password = ?,address = ?, birthday = ? phonenumber = ?,id_role =? where id =? ";
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setInt(6,account.getId());
//            preparedStatement.setString(1, account.getUsername());
//            preparedStatement.setString(2, account.getPassword());
//            preparedStatement.setString(3, account.getAddress());
//            preparedStatement.setDate(4, account.getBirthday());
//            preparedStatement.setInt(5, account.getId_role());
//            preparedStatement.execute();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//    }
 public static void deleteAccount(int id) {
        try {
            String sql = "DELETE FROM account WHERE id = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
