import io.github.yonghochoi.dao.DaoFactory;
import io.github.yonghochoi.dao.UserDao;
import io.github.yonghochoi.domain.User;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class UserAddTest {

    @Test
    public void test() throws ClassNotFoundException, SQLException {
        @SuppressWarnings("resource")
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDao dao = context.getBean("userDao", UserDao.class);

        // 저장
        User user = new User();
        user.setId("1");
        user.setName("홍길동");
        user.setPassword("1234");

        dao.add(user);
    }
}
