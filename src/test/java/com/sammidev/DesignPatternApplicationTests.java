package com.sammidev;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.sammidev.mediator.MediatorConfiguration;
import com.sammidev.mediator.service.StudentService;
import com.sammidev.observer.FushionService;
import com.sammidev.observer.ObserverConfiguration;
import com.sammidev.prototype.PrototypeConfig;
import com.sammidev.prototype.Student;
import com.sammidev.prototype.StudentType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PrototypeConfig.class)
public class DesignPatternApplicationTests {

	// ITERATOR PATTERN

	@Autowired
	private ApplicationContext applicationContext;
//	private MIPARouter mipaRouter;
//	private StudentService studentService;
//	private FushionService fushionService;



//	@Test
//	public void applyInformatic() {
//		mipaRouter.apply(MIPA.builder()
//		.nisn("12345")
//		.name("Sammi Aldhi Yanto")
//		.department(TypeOfDepartment.INFORMATICS)
//		.build());
//	}
//
//	@Test
//	public void applyCivil() {
//		mipaRouter.apply(MIPA.builder()
//				.nisn("12346")
//				.name("Ayatullah Ramadhan")
//				.department(TypeOfDepartment.CIVIL)
//				.build());
//	}
//
//	@Test
//	public void applyMedicine() {
//		mipaRouter.apply(MIPA.builder()
//		.nisn("12345")
//		.name("Sammi Aldhi Yanto")
//		.department(TypeOfDepartment.MEDICINE)
//		.build());
//	}
//
//	@Test
//	public void applyNuclear() {
//		mipaRouter.apply(MIPA.builder()
//				.nisn("12346")
//				.name("Ayatullah Ramadhan")
//				.department(TypeOfDepartment.NUCLEAR)
//				.build());
//	}


	// MEDIATOR PATTERN
//	@Test
//	public void testmediator() {
//		studentService.save("1","Sam", "sammidev@gmail.com");
//		studentService.save("2","Otong", "sotong@gmail.com");
//	}

	// OBSERVER
//
//	@Test
//	public void testObserver() {
//		for (int i = 1; i <= 5; i++) {
//			fushionService.save("S0000" + i,"E0000" + i, "Sammi" + i,"Ayatullah " + i);
//		}
//	}



	// TEST PROTOTYPE PATTERM
	@Test
	public void testClone() {
		Student student = Student.builder()
				.nisn("12345")
				.name("Sammidev")
				.email("Sammidev4@gmail.com")
				.type(StudentType.IPS)
				.build();

		Student student1 = new Student();
		BeanUtils.copyProperties(student, student1);
		assertEquals(student, student1);
	}

	@Test
	public void testPrototypeScope() {
		Student student  = applicationContext.getBean("MIPAStudent", Student.class);
		Student student1 = applicationContext.getBean("MIPAStudent", Student.class);

		assertEquals(student,student1);
		assertNotSame(student,student1);

	}
}