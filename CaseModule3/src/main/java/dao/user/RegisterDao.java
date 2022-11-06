package dao.user;

import dao.user.ConnectionMySQL;
import model.Account;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {

    public static void save(Account account) {
        try {
            String sql = "insert into account(username,password,address,birthday,phonenumber,id_role) value (?,?,?,?,?,?)";
            Connection connection = ConnectionMySQL.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, account.getUsername());
            preparedStatement.setString(2, account.getPassword());
            preparedStatement.setString(3, account.getAddress());
            preparedStatement.setDate(4, Date.valueOf(account.getBirthday()));
            preparedStatement.setString(5, account.getPhonenumber());
            preparedStatement.setInt(6, account.getId_role());
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }
    }
}
