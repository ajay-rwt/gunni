package ajayvikka.projects.gunni;

import ajayvikka.projects.gunni.model.*;
import ajayvikka.projects.gunni.dao.RoleDAO;
import ajayvikka.projects.gunni.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class GunniApplication {

	/*@Bean
	public RequirementClass getRequirementClass() {
		return new RequirementClass();
	}*/

	@Bean("ccb1")
	@Conditional(RequirementClass.class)
	public ConditionallyConfiguredBean getConditionallyConfiguredBean1() {
		return new ConditionallyConfiguredBean();
	}

	@Bean("ccb2")
	@ConditionalOnMissingBean(RequirementClass.class)
	public ConditionallyConfiguredBean getConditionallyConfiguredBean2() {
		return new ConditionallyConfiguredBean();
	}

	public static void main(String[] args) {

		ApplicationContext appContext  = SpringApplication.run(GunniApplication.class, args);

		RoleDAO roleDAO = appContext.getBean(RoleDAO.class);
			roleDAO.insertRole(new Role(RolesEnum.PROJECT_MANAGER));
			roleDAO.insertRole(new Role(RolesEnum.DEVELOPER));
			roleDAO.insertRole(new Role(RolesEnum.TESTER));
			roleDAO.insertRole(new Role(RolesEnum.CODE_REVIEWER));
			roleDAO.insertRole(new Role(RolesEnum.DEVELOPER));

		Name name = new Name("Rita", "", "Rana" );
		Contact contact = new Contact(1234567890, 987654321, "rita.rana@gml.com", "rita@rana.com", "www.ritarana.com" );
		Address address = new Address("2", "Brooke Buildings", "Vance St.", "Newark", "New Jersey", "California", "07101");
		List<Role> roles = new ArrayList<Role>(2);
			roles.add(new Role(RolesEnum.DEVELOPER));
			roles.add(new Role(RolesEnum.CODE_REVIEWER));
		UserLogin userLogin = new UserLogin("renu", "vrr");

		UserDAO userDAO = appContext.getBean(UserDAO.class);
			User user = new User(name, contact, address, roles, userLogin);
			userDAO.insertUser(user);


		System.out.println("*********************CONDITIONALLY CONFIGURED BEAN : "+appContext.getBean("ccb1"));
		System.out.println("*********************CONDITIONALLY CONFIGURED BEAN : "+appContext.getBean("ccb2"));
		AlternateConfig altConfig = (AlternateConfig)appContext.getBean("alternateConfig");
		altConfig.displayName();

	}

}

class RequirementClass implements Condition {

	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		return true;
	}

}

class ConditionallyConfiguredBean {
}
