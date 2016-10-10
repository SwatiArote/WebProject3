package com.swati.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by swati on 9/10/16.
 */


@Controller
public class HelloController {

    @RequestMapping("/home")
    public ModelAndView helloWorld() {

        String message = "<br><div style='text-align:center;'>"
                + "<h3>********** Welcome to Web Application*************</h3>" +
                "This message is coming from HelloController.java" +
                "</div><br><br>";
        return new ModelAndView("HelloPage", "message", message);
    }

    @RequestMapping("/greet/{username}")
    public ModelAndView greet(@PathVariable(value = "username")  String name){

        String message = "Hello...."+name;
        return new ModelAndView("Greet", "message", message);
    }

    @RequestMapping(value = "/login.html",method= RequestMethod.GET)
    public ModelAndView login(){
        System.out.println("Inside login method...");
        ModelAndView mod = new ModelAndView("Login");
        return mod;
    }


    @RequestMapping(value = "/submitForm.html",method= RequestMethod.POST)
    //parameter list will be too long if multiplle values we can use map
  //  public ModelAndView formsubmission(@RequestParam("studentName") String name, @RequestParam("courseChoice") String course ){

    public ModelAndView formsubmission(@RequestParam Map<String,String> parammap){
        String name=parammap.get("studentName");
        String course=parammap.get("courseChoice");

        String msg="Hello.."+name+".. Your request for joing "+course+" course has been recevieved..";
        ModelAndView mod = new ModelAndView("SubmitedForm","msg",msg);
        return mod;
    }

    @RequestMapping("voterentry.html")
    public ModelAndView showForm() {                 //PersonVoter personVoter
        return new ModelAndView("VoterForm");
    }

    @RequestMapping(value = "/votersSubmitted.html",method= RequestMethod.POST)
    public ModelAndView voterSubmiited(){
        ModelAndView mod = new ModelAndView("VoterSubmission");
        return mod;
    }




}
