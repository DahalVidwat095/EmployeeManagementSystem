package Employee;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class Update_EmployeeTest {

    @Test
    void main() {
        Conn db = new Conn();
        String str = "select * from employee where emp_id = '"+"s"+"'";
        try {
            ResultSet rs = db.s.executeQuery(str);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //assertEquals(1, ResultSet);
    }
}