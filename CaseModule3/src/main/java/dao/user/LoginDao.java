package dao.user;

import dao.user.ConnectionMySQL;
import model.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class LoginDao {

    public static Account login(String username ,String password){
        try{
            String sql = "select*from account where username = ? and password = ?";
            Connection connection = ConnectionMySQL.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            ResultSet resultSet = preparedStatement.executeQuery();
            Account account = null;
            if(resultSet.next())
            {
                int id = resultSet.getInt("id");
                String username1 = resultSet.getString("username");
                String password1 = resultSet.getString("password");
                String address = resultSet.getString("address");
                LocalDate birthday = resultSet.getDate("birthday").toLocalDate();
                String phonenumber = resultSet.getString("phonenumber");
                int id_role = resultSet.getInt("id_role");
                account = new Account(id,username1,password1,address,birthday,phonenumber,id_role);
            }
            return account;
        }catch (SQLException e)
        {
            e.printStackTrace();
            return null;
        }
    }

}
