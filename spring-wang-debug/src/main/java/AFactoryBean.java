import org.springframework.beans.factory.FactoryBean;

public class AFactoryBean implements FactoryBean<Person> {
	@Override
	public Person getObject() throws Exception {
		Person person = new Person();
		person.setName("person factoryBean");
		return person;
	}

	@Override
	public Class<?> getObjectType() {
		return Person.class;
	}
}
