//package com.Snigdha.Snigdha.controller;
//
//import com.Snigdha.Snigdha.dao.GrievanceRepository;
//import com.Snigdha.Snigdha.models.Grievance;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import java.util.List;
//@Controller
//public class GrievanceController {
//
//
//    @Autowired
//    private GrievanceRepository grievanceRepository;
//
//    @GetMapping(path = "/grievances")
//    public String getGrievances(Model model){
//        grievanceRepository.createGrievanceTable();
//        List<Grievance> grievances = grievanceRepository.projectGrievance();
//        model.addAttribute("grievances",grievances);
//        return "addgrievance";
//    }
//
//    @RequestMapping(value="/addgrievance",method=RequestMethod.GET)
//    public String addGrievance(Model model){
//        return "addgrievance";
//    }
//
//    @RequestMapping(value = "/addgrievance",method = RequestMethod.POST)
//    public String addGrievance(Grievance grievance){
//        grievanceRepository.createGrievance(grievance);
//        return "success";
//    }
//}

        package com.Snigdha.Snigdha.controller;


import com.Snigdha.Snigdha.dao.GrievanceRepository;
import com.Snigdha.Snigdha.models.Grievance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GrievanceController {

    @Autowired
    private GrievanceRepository grievanceRepository;

    @GetMapping("/grievances")
    public String getGrievances(Model model) {

        grievanceRepository.createGrievanceTable();

        grievanceRepository.createGrievanceTable(); // Ensure the table is created (You may want to move this to a separate setup method)

        return "addgrievance";
    }

    @RequestMapping(value = "/addgrievance", method = RequestMethod.POST)
    public String addGrievance(Grievance grievance) {
        grievanceRepository.createGrievance(grievance);
        return "success";
    }

}