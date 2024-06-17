package Employee;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class Remove_EmployeeTest {

    @Test
    void main() {
        Conn db = new Conn();
        String str = "select name,phone,email from employee where emp_id ='"+"t.getText()"+"' ";
        try {
            ResultSet rs = db.s.executeQuery(str);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}