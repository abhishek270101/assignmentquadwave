package tech.codingclub.helix.controller;

import org.apache.log4j.Logger;
import org.jooq.Condition;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import tech.codingclub.helix.database.GenericDB;
import tech.codingclub.helix.entity.Assignment1;
import tech.codingclub.helix.entity.SignupResponse;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * User: rishabh
 */
@Controller
@RequestMapping("/")
public class MainController extends BaseController {

    private static Logger logger = Logger.getLogger(MainController.class);

    @RequestMapping(method = RequestMethod.GET, value = "/employeedetails")
    public String getQuiz(ModelMap modelMap, HttpServletResponse response, HttpServletRequest request) {
        return "employeedetails";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/mainpage")
    public String getQuiz2(ModelMap modelMap, HttpServletResponse response, HttpServletRequest request) {
        return "mainpage";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/handle")
    public
    @ResponseBody
    String handleEncrypt(@RequestBody String data, HttpServletRequest request, HttpServletResponse response) {
        return "ok";
    }
   @RequestMapping(method = RequestMethod.POST, value = "/employeedetails")
    public
    @ResponseBody
   SignupResponse signUpData(@RequestBody Assignment1 assignment1, HttpServletRequest request, HttpServletResponse response) {
        boolean user_created=false;
        String message="";
       Condition condition=tech.codingclub.helix.tables.Assignment1.ASSIGNMENT1.EID.eq(assignment1.Eid);
       if(GenericDB.getCount(tech.codingclub.helix.tables.Assignment1.ASSIGNMENT1, condition)>0)
        {
            message="Employee exists already";
        }
        else
        {
            //member.role="cm";
            new GenericDB<Assignment1>().addRow(tech.codingclub.helix.tables.Assignment1.ASSIGNMENT1,assignment1);
            user_created=true;
            message="Employee details saved";
        }
        return new SignupResponse(message,user_created);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/mainpage")
    public
    @ResponseBody
    SignupResponse checkUserData(@RequestBody Assignment1 assignment1, HttpServletRequest request, HttpServletResponse response) {
        boolean user_created=true;
        String message="";
        Condition condition=tech.codingclub.helix.tables.Assignment1.ASSIGNMENT1.EID.eq(assignment1.Eid);
        if(GenericDB.getCount(tech.codingclub.helix.tables.Assignment1.ASSIGNMENT1, condition)>0)
        {
            message="Employee is present";
        }
        else
        {
            user_created=false;
            message="Employee not present";
        }
        return new SignupResponse(message,user_created);
    }
}