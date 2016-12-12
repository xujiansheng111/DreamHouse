package Model;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by xujiansheng on 2016/11/29.
 */
public class User {

    public ArrayList<String> getAllUser() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String dbUrl = "jdbc:mysql://localhost:3306/dreamHouse";
        Connection con = DriverManager.getConnection(dbUrl,"root","");
        Statement stmt = con.createStatement();
        String sql = "select userName from user";
        ResultSet rs = stmt.executeQuery(sql);

        ArrayList<String> userNames = new ArrayList<>();

        while (rs.next()){
            String username = rs.getString("userName");
            userNames.add(username);
        }

        rs.close();
        stmt.close();
        con.close();

        return userNames;
    }
}
