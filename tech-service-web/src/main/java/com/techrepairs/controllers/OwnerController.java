package com.techrepairs.controllers;


import com.techrepairs.services.jpaservices.OwnerJPAService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerJPAService ownerService;

    public OwnerController(OwnerJPAService ownerService){
        this.ownerService = ownerService;
    }

    @RequestMapping({"/find","/"})
    public @ResponseBody String findOwner(){
        //model.addAttribute("owners", ownerService.findAll());
        return "index";
    }

    @GetMapping("{ownerId}")
    public ModelAndView showOwner(@PathVariable Long ownerId){
        ModelAndView mav = new ModelAndView("owners/ownerDetails");
        mav.addObject(ownerService.findById(ownerId));
        return mav;
    }
}
