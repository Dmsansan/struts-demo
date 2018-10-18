package cn.tedu.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import cn.tedu.entity.UserValue;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	
	private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    private String passWord;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String execute(){
	    String ret = ERROR;
        Connection con = null;
        try {
            String URL = "jdbc:mysql://localhost:3306/struts_test";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, "root", "root123");
            String sql = "SELECT * FROM user_info WHERE";
            sql+=" username = ? AND password = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "haha");
            ps.setString(2, "haha123");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                id = Integer.parseInt(rs.getString(1));
                userName = rs.getString(2);
                passWord = rs.getString(3);
                ret = SUCCESS;
            }
        } catch (Exception e) {
            ret = ERROR;
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (Exception e) {
                }
            }
        }
        return ret;

	}
	
	
	

}
