import com.duxuan.pojo.Books;
import com.duxuan.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookServiceImp = app.getBean("BookServiceImp", BookServiceImpl.class);
        List<Books> list = bookServiceImp.queryAllBooks();
        for (Books books : list) {
            System.out.println(books);
        }
    }
}
