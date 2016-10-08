import io.github.yonghochoi.dao.DaoFactory;
import io.github.yonghochoi.dao.UserDao;
import io.github.yonghochoi.domain.User;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

public class UserGetTest {
    @Test
    public void test() throws ClassNotFoundException, SQLException {
        @SuppressWarnings("resource")
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDao dao = context.getBean("userDao", UserDao.class);

        // 조회
        User user = dao.get("1");
        System.out.println(user.getName());

        assertEquals("홍길동", user.getName());
    }

    @Test
    public void testUsingXml() throws ClassNotFoundException, SQLException {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:application-context.xml");
        UserDao dao = context.getBean("userDao", UserDao.class);

        // 조회
        User user = dao.get("1");
        System.out.println(user.getName());

        assertEquals("홍길동", user.getName());
    }
}
