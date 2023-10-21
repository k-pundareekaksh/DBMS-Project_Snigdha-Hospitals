//package com.Snigdha.Snigdha.controller;
//
//import com.Snigdha.Snigdha.dao.GrievanceRepository;
//import com.Snigdha.Snigdha.models.Grievance;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import java.util.List;
//
//public class GrievanceController {
//
//
//    @Autowired
//    private GrievanceRepository grievanceRepository;
//
//    @GetMapping("/grievances")
//    public String getDoctors(Model model){
//        List<Grievance> grievances =  grievanceRepository.projectGrievance();
//        model.addAttribute("grievances",grievances);
//        return "grievances";
//    }
//
//    @PostMapping("/addgrievance")
//    public String addGrievance(Grievance grievance){
//        grievanceRepository.createAppointment(grievance);
//        return "success";
//    }
//
//
//}
