package rikkei.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import rikkei.academy.model.Employee;
import rikkei.academy.service.EmployeeService;

@Controller
public class EmployeeController {
    @GetMapping(value = {"/","/employee"})
    public String showForm(ModelMap model) {
        model.addAttribute("employee", EmployeeService.employee);
        return "employee/create";
    }

    //    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    @PostMapping("/addEmployee")

    public String submit(Employee employee, ModelMap model) {
        model.addAttribute("employee", employee);
        EmployeeService.employee=employee;
         return "employee/info";
    }

}
