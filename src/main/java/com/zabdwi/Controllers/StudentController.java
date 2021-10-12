package com.zabdwi.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zabdwi.PropertyEditor.NamePropertyEditor;
import com.zabdwi.api.MarksStudent;
import com.zabdwi.api.Student;
import com.zabdwi.service.StudentService;

@Controller

public class StudentController {
	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showStudent_List(Model model) {
		
		// call the service to get data students
		List<Student> loadStudents = studentService.loadStudents();
		//System.out.println(loadStudents);
		
		model.addAttribute("ListStudent", loadStudents);
		model.addAttribute("student", new Student());
		return "student-list";
	}

	@GetMapping("/add")
	public String addStudent(@ModelAttribute("student") Student student) {
		
		
		return "add-student";
	}
	
	@GetMapping("/updateStudent")
	public String updateStudent(@RequestParam("Id") int id, Model model) {

		Student theStudent = studentService.getStudent(id);

		model.addAttribute("student", theStudent);

		return "update-student";
	}

	@PostMapping("/save-update-Student")
	public String saveStudent(@Valid @ModelAttribute("student") Student student,BindingResult result) {
		System.out.println(student);
		if (student.getId()==0 &&result.hasErrors()) {
			return "add-student";
		}
		if (student.getId()!=0&&result.hasErrors()) {
			return "update-student";
		}
		
		// call the service to save data at DB
		
		if (student.getId()== 0) {
			studentService.save(student);
		}else {
			studentService.update(student);
		}
		return "redirect:/";
	}

	@GetMapping("/delete-Student")
	public String delete(@RequestParam("Id")int id) {
		
		// call the service to delete a data at DB
		studentService.delete(id);

		return "redirect:/";
	}
	
	
	@GetMapping("/searchStudent")
	public String searchStudent(Model model,Student student) {
		
		// call the service to search a data at DB
		
		List<Student> search = studentService.search(student.getName());
		model.addAttribute("searchList", search);
		model.addAttribute("student", new Student());
		
		return "search-list";
	}
	@GetMapping("/marksStudent")
	public String marksStudent(@RequestParam("Id")int id, @ModelAttribute("mark") MarksStudent marksStudent,Model model) {
		
		marksStudent.setIdStudent(id);
		
		List<MarksStudent> markStudent = studentService.getMarkStudent(id);
		for (MarksStudent marksStudent2 : markStudent) {
			marksStudent2.setTotalScore(marksStudent2.getJava()+marksStudent2.getPython()+marksStudent2.getData_structure()+marksStudent2.getC());
			
		}
		System.out.println(markStudent);
		model.addAttribute("marks", markStudent);
		return "marks-student";
	}
	@GetMapping("/addMarksStudent")
	public String addMarksStudent(@RequestParam("Id")int id,@ModelAttribute("mark") MarksStudent marksStudent ) {
		marksStudent.setIdStudent(id);
		// call the service to search a data at DB
		
		//System.out.println(marksStudent);
		
		return "add-Marks-student";
	}
	@GetMapping("/saveMarksStudent")
	public String saveMarksStudent(@ModelAttribute("mark") MarksStudent marksStudent ) {
		
		// call the service to search a data at DB
		
		System.out.println(marksStudent);
		studentService.saveMark(marksStudent);
		
		return "redirect:/";
	}
	@InitBinder
	private void InitBinder(WebDataBinder binder) {
		System.out.println("initBinder");
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, "name", editor);
		
		StringTrimmerEditor editor_blood_group = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, "blood_group", editor_blood_group);
		
		NamePropertyEditor propertyEditor = new NamePropertyEditor();
		binder.registerCustomEditor(String.class,"blood_group", propertyEditor);
	}
	

}
