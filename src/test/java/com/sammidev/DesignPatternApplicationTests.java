package com.sammidev;

import com.sammidev.mediator.MediatorConfiguration;
import com.sammidev.mediator.service.StudentService;
import com.sammidev.observer.FushionService;
import com.sammidev.observer.ObserverConfiguration;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ObserverConfiguration.class)
public class DesignPatternApplicationTests {

	// ITERATOR PATTERN

	@Autowired
//	private MIPARouter mipaRouter;
//	private StudentService studentService;
	private FushionService fushionService;


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

	@Test
	public void testObserver() {
		for (int i = 1; i <= 5; i++) {
			fushionService.save("S0000" + i,"E0000" + i, "Sammi" + i,"Ayatullah " + i);
		}
	}
}