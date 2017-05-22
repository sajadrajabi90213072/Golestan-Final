package de.michlb.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by Sam on 5/12/2017.
 */

@Controller
public class SessionController {


    @RequestMapping( value = "/log_out" ,method = RequestMethod.GET)
    ModelAndView Exit (ModelAndView mav    , HttpSession httpSession       )
    {
        ModelAndView temp = new ModelAndView() ;

        if( httpSession == null )
        {
            temp.setViewName("redirect:/");
            return temp ;
        }


        httpSession.removeAttribute("Username");
        httpSession.invalidate();
        mav.getModel().clear();
        //store.cleanupAttribute(request, "Username");

        temp.setViewName("redirect:/");



        temp.setViewName("redirect:/");
        return temp ;


    }

//adminlog_out
    @RequestMapping( value = "/proflog_out" ,method = RequestMethod.GET)
    ModelAndView ProfExit (ModelAndView mav    , HttpSession httpSession       )
    {
        ModelAndView temp = new ModelAndView() ;

        if( httpSession == null )
        {
            temp.setViewName("redirect:/");
            return temp ;
        }


        httpSession.removeAttribute("Username");
        httpSession.invalidate();
        mav.getModel().clear();
        //store.cleanupAttribute(request, "Username");

        temp.setViewName("redirect:/Prof");



        temp.setViewName("redirect:/Prof");
        return temp ;


    }


    @RequestMapping( value = "/adminlog_out" ,method = RequestMethod.GET)
    ModelAndView AdminExit (ModelAndView mav    , HttpSession httpSession       )
    {
        ModelAndView temp = new ModelAndView() ;

        if( httpSession == null )
        {
            temp.setViewName("redirect:/");
            return temp ;
        }


        httpSession.removeAttribute("Username");
        httpSession.invalidate();
        mav.getModel().clear();
        //store.cleanupAttribute(request, "Username");

        temp.setViewName("redirect:/Admin");



        temp.setViewName("redirect:/Admin");
        return temp ;


    }


}
