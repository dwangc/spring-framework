import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//		Person person = (Person) context.getBean("aFactoryBean");
//		System.out.println(person);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-${user.name}.xml");
		System.out.println(context);
	}
}
