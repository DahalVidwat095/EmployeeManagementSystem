package Employee;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class Add_EmployeeTest {

    @Test
    void main() {
        Conn cc = new Conn();
        String query = "insert into employee values('"+"a"+"','"+"bb"+"','"+"c"+"','"+"d"+"','"+"e"+"','"+"ff"+"','"+"g"+"','"+"h"+"','"+"i"+"','"+"j"+"','"+"k"+"')";
        int result = 0;
        try {
            result = cc.s.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        assertEquals(1, result);
    }
}