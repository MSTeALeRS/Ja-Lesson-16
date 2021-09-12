package ua.lviv.lgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ua.lviv.lgs.dao.StudentDao;
import ua.lviv.lgs.domain.Student;


@SpringBootApplication
public class app {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(app.class, args);

        StudentDao studentDao = context.getBean(StudentDao.class);
        studentDao.create(new Student(1, "Tom", 17));
        studentDao.create(new Student(2, "Marvolo", 35));
        studentDao.readAll().stream().forEach(System.out::println);
        studentDao.update(new Student(2, "Redl", 25));
        System.out.println(studentDao.read(2));
        System.out.println();

        studentDao.delete(1);
        studentDao.readAll().stream().forEach(System.out::println);
    }
}
