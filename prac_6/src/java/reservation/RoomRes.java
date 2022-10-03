/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservation;

import javax.ejb.Stateless;
import javax.sql.*;
import java.sql.*;

/**
 *
 * @author Admin
 */
@Stateless
public class RoomRes {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public boolean canRes(String cname,String sdate,String edate){
        try{
        boolean flag = true;
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = (Connection)
        DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","123");
        PreparedStatement ps;
        ps = con.prepareStatement("select * from room where sdate=?");       
        ps.setDate(1, Date.valueOf(sdate));
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            flag = false;
            return flag;
        }
        else{
            PreparedStatement ps1 = com.PrepareStatement("insert into room values(?,?,?)");
            ps1.setString(1,cname);
            ps1.setString(3,Date.valueOf(sdate));
            ps1.setString(4,Date.valueOf(edate));
            
        }
    }
        
        catch(Exception e){
            return false;
        }
    }
}
