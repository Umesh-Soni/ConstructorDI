package driverClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Employee;

/**
 * @author umesh.soni
 *
 */
public class Test {

	public static void main(String args[]){
		ApplicationContext ac = new ClassPathXmlApplicationContext("resources/springioc.xml");
		Employee emp = (Employee)ac.getBean("employee");
		emp.printEmployee();
	}
}
