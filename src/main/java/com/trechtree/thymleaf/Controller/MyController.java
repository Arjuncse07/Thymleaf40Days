package com.trechtree.thymleaf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.sound.midi.MidiDevice;
import java.time.LocalDateTime;
import java.util.Date;

@Controller
public class MyController {

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(Model model){


        model.addAttribute("name","Arjun");
        model.addAttribute("currentDate", new Date().toInstant());
        System.out.println("Inside about handler..");
        return "about";
    }

    //handler for including fragment
    @GetMapping("/service")
    public String servicesHandler(Model model){
        model.addAttribute("name","Arjun Singhh");
        model.addAttribute("title","Tile:I like to eat samosa");
        model.addAttribute("subtitle", LocalDateTime.now().toString());
        return "service";
    }

    //for new about
    @GetMapping("/newAbout")
    public  String newAbout(){

        return "aboutnew";
    }


    @GetMapping("/contact")
    public  String contact(){

        return "contact";
    }
}
