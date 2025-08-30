import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tasks.config.AppConfig;


import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class test {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Check connection to DB
        DataSource dataSource = context.getBean(DataSource.class);
        Connection connection = dataSource.getConnection();
        if (connection != null) {
            System.out.println("Connected to database successfully");
        }


    }
}
