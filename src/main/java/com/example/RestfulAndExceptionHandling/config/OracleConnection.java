//import java.sql.Connection;
//import java.sql.DriverManager;
//
//public class OracleConnection {
//    public static void main(String[] args) {
//        String url = "jdbc:oracle:thin:@localhost:1521/PRACTICEDB";
//        String user = "SCHEMA_1";
//        String password = "SCHEMA_1";
//
//        try {
//            Connection connection = DriverManager.getConnection(url, user, password);
//            System.out.println("Kết nối thành công!");
//            connection.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}