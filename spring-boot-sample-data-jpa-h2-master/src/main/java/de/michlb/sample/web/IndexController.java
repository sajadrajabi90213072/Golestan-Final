package de.michlb.sample.web;

import de.michlb.sample.domain.*;
import de.michlb.sample.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by mbart on 28.02.2016.
 */
@Controller
@SessionAttributes( {"Username" , "Type" } )
public class IndexController {

    @Autowired
    private PersonService personService;

    @Autowired
    private StudentService SS ;


    @Autowired
    private ProfCourseService PCS ;


    @Autowired
    private TakeLessonService TLS ;

    @Autowired
    private CourseService CS ;


    @Autowired
    private PreService PreS ;

    @Autowired
    private ProfService PS ;

    @Autowired
    private PersonService PerS ;

    @RequestMapping("/")
    public String showIndex(Model model) {
      //List<Person> personList = personService.loadAll();

      //model.addAttribute("personList", personList);

      return "index"; // return index.html Template
    }

    @RequestMapping("/Prof")
    public String ShowProfLogin(Model model) {
        //List<Person> personList = personService.loadAll();

        //model.addAttribute("personList", personList);

        return "ProfLogin"; // return index.html Template
    }


    @RequestMapping("/Admin")
    public String ShowAdminLogin(Model model) {
        //List<Person> personList = personService.loadAll();

        //model.addAttribute("personList", personList);

        return "AdminLogin"; // return index.html Template
    }


    @RequestMapping( value = "/LoginController" ,method = RequestMethod.POST )
    public ModelAndView login(@RequestParam("username") @Valid Integer username ,
                              @RequestParam("password")  String password  ) {
      //List<Person> personList = personService.loadAll();

      //model.addAttribute("personList", personList);


        ModelAndView temp = new ModelAndView() ;

//        if ( errors.hasErrors() )
//        {
//          temp.addObject( "msg" , "نام کاربری معتبر نیست ") ;
//          temp.setViewName( "index");
//          return  temp ;
//        }



        Student S = SS.FindOne( username ) ;

        if (  ( S != null ) && ( S.getStudentPassword().equals( password ) ) )
        {
            temp.setViewName("Dashboard");
            temp.addObject( "Username" , username  ) ;
            temp.addObject( "Type" , "Student" ) ;


            return temp ;


        }


        temp.setViewName("index");
        temp.addObject( "msg" , "نام کاربری یا گذرواژه اشتباه است . ");
        return temp; // return index.html Template
    }



    @RequestMapping( value = "/profile" ,method = RequestMethod.GET )
    public ModelAndView ProfilePage( ModelAndView mav  , HttpSession httpSession )
    {

        ModelAndView temp = new ModelAndView() ;

        if( httpSession == null )
        {
            temp.setViewName("redirect:/");
            return temp ;
        }

        Integer A = ( (Integer ) httpSession.getAttribute("Username") ) ;
        String B = (String )httpSession.getAttribute("Type") ;



        if ( A == null && B == null  )
        {
            temp.setViewName("redirect:/");
            return temp ;
        }

        if (  !(  B.equals("Student")  )   )
        {
            temp.setViewName("redirect:/");
            return temp ;
        }


        temp.setViewName("Account");
        return temp ;

//update_profile
    }



    @RequestMapping( value = "/update_profile" ,method = RequestMethod.POST )
    public ModelAndView ProfileUpdate ( ModelAndView mav  , HttpSession httpSession ,
                                        @RequestParam("name") String name ,
                                        @RequestParam("password") String pass ,
                                        @RequestParam("mobile") String phone ,
                                        @RequestParam("ssn") String ssn ,
                                        @RequestParam("fathername") String fathername ,
                                        @RequestParam("address") String address )
    {



        ModelAndView temp = new ModelAndView() ;

        if( httpSession == null )
        {
          temp.setViewName("redirect:/");
          return temp ;
        }

        Integer A = ( (Integer ) httpSession.getAttribute("Username") ) ;
        String B = (String )httpSession.getAttribute("Type") ;



        if ( A == null && B == null  )
        {
          temp.setViewName("redirect:/");
          return temp ;
        }

        if (  !(  B.equals("Student")  )   )
        {
          temp.setViewName("redirect:/");
          return temp ;
        }


        Student S = SS.FindOne( A ) ;

        if ( name != null && name != "" )
        {
            S.setStudentName( name );
        }

        if ( pass != null && pass != "" )
        {
            S.setStudentPassword( pass );
        }


        if ( phone != null && phone != "" )
        {
            S.setStudentPhoneNumber( phone );
        }


        if ( ssn != null && ssn != "" )
        {
            S.setStudnetNationalCode( ssn );
        }

        if ( fathername != null && fathername != "" )
        {
            S.setStudentFatherName( fathername );
        }

        if ( address != null && address != "" )
        {
            S.setStudentAddress( address );
        }


        SS.Save( S ) ;

        temp.setViewName("Account");
        return temp ;



    }





    @RequestMapping( value = "/result" ,method = RequestMethod.GET )
    public ModelAndView ResultPage( ModelAndView mav  , HttpSession httpSession )
    {

        ModelAndView temp = new ModelAndView() ;

        if( httpSession == null )
        {
          temp.setViewName("redirect:/");
          return temp ;
        }

        Integer A = ( (Integer ) httpSession.getAttribute("Username") ) ;
        String B = (String )httpSession.getAttribute("Type") ;



        if ( A == null && B == null  )
        {
          temp.setViewName("redirect:/");
          return temp ;
        }

        if (  !(  B.equals("Student")  )   )
        {
          temp.setViewName("redirect:/");
          return temp ;
        }


        temp.setViewName("Result");
        return temp ;

  //update_profile
    }




    @RequestMapping( value = "/take" ,method = RequestMethod.GET )
    public ModelAndView TakePage( ModelAndView mav  , HttpSession httpSession )
    {

        ModelAndView temp = new ModelAndView() ;

        if( httpSession == null )
        {
            temp.setViewName("redirect:/");
            return temp ;
        }

        Integer A = ( (Integer ) httpSession.getAttribute("Username") ) ;
        String B = (String )httpSession.getAttribute("Type") ;



        if ( A == null && B == null  )
        {
            temp.setViewName("redirect:/");
            return temp ;
        }

        if (  !(  B.equals("Student")  )   )
        {
            temp.setViewName("redirect:/");
            return temp ;
        }


        Student S = SS.FindOne(A) ;


        Iterable<Profcourse> list = PCS.FindAll() ;

        temp.addObject( "Course" , list) ;

        Iterable<Takelesson> course = TLS.FindStudentCourse( S ) ;


        temp.addObject( "MyCourse" , course ) ;

        temp.setViewName("TakeLesson");
        return temp ;


    }



    @RequestMapping( value = "/take_lesson" ,method = RequestMethod.POST )
    public ModelAndView TakeLesson( ModelAndView mav  , HttpSession httpSession ,
                                     @RequestParam("Code") Integer Code )
    {

        ModelAndView temp = new ModelAndView() ;

        if( httpSession == null )
        {
            temp.setViewName("redirect:/");
            return temp ;
        }

        Integer A = ( (Integer ) httpSession.getAttribute("Username") ) ;
        String B = (String )httpSession.getAttribute("Type") ;



        if ( A == null && B == null  )
        {
            temp.setViewName("redirect:/");
            return temp ;
        }

        if (  !(  B.equals("Student")  )   )
        {
            temp.setViewName("redirect:/");
            return temp ;
        }


        Student S = SS.FindOne(A) ;


        Profcourse pc = PCS.FindOne( Code ) ;


        if ( pc == null )
        {
            Iterable<Profcourse> list = PCS.FindAll() ;

            temp.addObject( "Course" , list) ;

            Iterable<Takelesson> course = TLS.FindStudentCourse( S ) ;


            temp.addObject( "MyCourse" , course ) ;



            temp.setViewName("TakeLesson");
            return temp ;
        }


        Takelesson Tl = new Takelesson() ;
        Tl.setCourseID( pc.getCourseID() );
        Tl.setProfID( pc.getProfID() );
        Tl.setTerm( pc.getTerm());
        Tl.setYear( pc.getYear() );
        Tl.setStudentID( S );

        TLS.Save( Tl ) ;


        Iterable<Profcourse> list = PCS.FindAll() ;

        temp.addObject( "Course" , list) ;

        Iterable<Takelesson> course = TLS.FindStudentCourse( S ) ;


        temp.addObject( "MyCourse" , course ) ;



        temp.setViewName("TakeLesson");
        return temp ;


    }




    @RequestMapping( value = "/delete_lesson" ,method = RequestMethod.POST )
    public ModelAndView DeleteLesson( ModelAndView mav  , HttpSession httpSession ,
                                    @RequestParam("Code") Integer Code )
    {

        ModelAndView temp = new ModelAndView() ;

        if( httpSession == null )
        {
            temp.setViewName("redirect:/");
            return temp ;
        }

        Integer A = ( (Integer ) httpSession.getAttribute("Username") ) ;
        String B = (String )httpSession.getAttribute("Type") ;



        if ( A == null && B == null  )
        {
            temp.setViewName("redirect:/");
            return temp ;
        }

        if (  !(  B.equals("Student")  )   )
        {
            temp.setViewName("redirect:/");
            return temp ;
        }


        Student S = SS.FindOne(A) ;


        Takelesson tl = TLS.FindOne( Code ) ;

        if ( tl == null )
        {
            Iterable<Profcourse> list = PCS.FindAll() ;

            temp.addObject( "Course" , list) ;

            Iterable<Takelesson> course = TLS.FindStudentCourse( S ) ;


            temp.addObject( "MyCourse" , course ) ;



            temp.setViewName("TakeLesson");
            return temp ;
        }


        TLS.Delete( Code );




        Iterable<Profcourse> list = PCS.FindAll() ;

        temp.addObject( "Course" , list) ;

        Iterable<Takelesson> course = TLS.FindStudentCourse( S ) ;


        temp.addObject( "MyCourse" , course ) ;



        temp.setViewName("TakeLesson");
        return temp ;


    }







    @RequestMapping( value = "/select_result" ,method = RequestMethod.POST )
    public ModelAndView SelectResult( ModelAndView mav  , HttpSession httpSession ,
                                      @RequestParam("term") String  term ,
                                      @RequestParam("year") String year)
    {

        ModelAndView temp = new ModelAndView() ;

        if( httpSession == null )
        {
            temp.setViewName("redirect:/");
            return temp ;
        }

        Integer A = ( (Integer ) httpSession.getAttribute("Username") ) ;
        String B = (String )httpSession.getAttribute("Type") ;



        if ( A == null && B == null  )
        {
            temp.setViewName("redirect:/");
            return temp ;
        }

        if (  !(  B.equals("Student")  )   )
        {
            temp.setViewName("redirect:/");
            return temp ;
        }


        Student S = SS.FindOne(A) ;


        Iterable<Takelesson> list = TLS.FindStudentCourse( S , year , term );
        temp.addObject( "Course" , list) ;


        float sum = 0 ;
        float scores = 0 ;

        for ( Takelesson T : list )
        {
            if ( T.getScore() != null )
            {
                scores = scores + Float.parseFloat(T.getCourseID().getCourseScore());
                sum = sum + (Float.parseFloat(T.getScore()) * Float.parseFloat(T.getCourseID().getCourseScore()));
            }

        }

        if ( sum == 0 || scores == 0 )
        {
            temp.addObject( "avg" , "0");
        }
        else
        {
            temp.addObject( "avg" , sum/scores ) ;
        }


        temp.setViewName("Result");
        return temp ;


    }




    @RequestMapping( value = "/ProfLoginController" ,method = RequestMethod.POST )
    public ModelAndView ProfLogin(@RequestParam("username") @Valid Integer username ,
                              @RequestParam("password")  String password  ) {
        //List<Person> personList = personService.loadAll();

        //model.addAttribute("personList", personList);


        ModelAndView temp = new ModelAndView() ;

//        if ( errors.hasErrors() )
//        {
//          temp.addObject( "msg" , "نام کاربری معتبر نیست ") ;
//          temp.setViewName( "index");
//          return  temp ;
//        }



        Prof S = PS.FindOne( username ) ;

        if (  ( S != null ) && ( S.getProfPassword().equals( password ) ) )
        {
            temp.setViewName("ProfDashboard");
            temp.addObject( "Username" , username  ) ;
            temp.addObject( "Type" , "Prof" ) ;


            return temp ;


        }


        temp.setViewName("ProfLogin");
        temp.addObject( "msg" , "نام کاربری یا گذرواژه اشتباه است . ");
        return temp; // return index.html Template
    }





    @RequestMapping( value = "/profprofile" ,method = RequestMethod.GET )
    public ModelAndView ProfProfilePage( ModelAndView mav  , HttpSession httpSession )
    {

        ModelAndView temp = new ModelAndView() ;

        if( httpSession == null )
        {
            temp.setViewName("redirect:/Prof");
            return temp ;
        }

        Integer A = ( (Integer ) httpSession.getAttribute("Username") ) ;
        String B = (String )httpSession.getAttribute("Type") ;



        if ( A == null && B == null  )
        {
            temp.setViewName("redirect:/Prof");
            return temp ;
        }

        if (  !(  B.equals("Prof")  )   )
        {
            temp.setViewName("redirect:/Prof");
            return temp ;
        }


        temp.setViewName("ProfAccount");
        return temp ;

//update_profile
    }



    @RequestMapping( value = "/profupdate_profile" ,method = RequestMethod.POST )
    public ModelAndView profProfileUpdate ( ModelAndView mav  , HttpSession httpSession ,
                                        @RequestParam("name") String name ,
                                        @RequestParam("password") String pass ,
                                        @RequestParam("mobile") String phone ,
                                        @RequestParam("ssn") String ssn ,
                                        @RequestParam("fathername") String fathername ,
                                        @RequestParam("address") String address )
    {



        ModelAndView temp = new ModelAndView() ;

        if( httpSession == null )
        {
            temp.setViewName("redirect:/Prof");
            return temp ;
        }

        Integer A = ( (Integer ) httpSession.getAttribute("Username") ) ;
        String B = (String )httpSession.getAttribute("Type") ;



        if ( A == null && B == null  )
        {
            temp.setViewName("redirect:/Prof");
            return temp ;
        }

        if (  !(  B.equals("Prof")  )   )
        {
            temp.setViewName("redirect:/Prof");
            return temp ;
        }


        Prof S = PS.FindOne( A ) ;

        if ( name != null && name != "" )
        {
            S.setProfName( name );
        }

        if ( pass != null && pass != "" )
        {
            S.setProfPassword( pass );
        }


        if ( phone != null && phone != "" )
        {
            S.setProfPhone( phone );
        }


        if ( ssn != null && ssn != "" )
        {
            S.setProfSSN( ssn );
        }

        if ( fathername != null && fathername != "" )
        {
            S.setProfFatherName( fathername );
        }

        if ( address != null && address != "" )
        {
            S.setProfAddress( address );
        }


        PS.Save( S ) ;

        temp.setViewName("ProfAccount");
        return temp ;



    }


    @RequestMapping( value = "/list" ,method = RequestMethod.GET )
    public ModelAndView StudentList ( ModelAndView mav  , HttpSession httpSession )
    {

        ModelAndView temp = new ModelAndView() ;

        if( httpSession == null )
        {
            temp.setViewName("redirect:/Prof");
            return temp ;
        }

        Integer A = ( (Integer ) httpSession.getAttribute("Username") ) ;
        String B = (String )httpSession.getAttribute("Type") ;



        if ( A == null && B == null  )
        {
            temp.setViewName("redirect:/Prof");
            return temp ;
        }

        if (  !(  B.equals("Prof")  )   )
        {
            temp.setViewName("redirect:/Prof");
            return temp ;
        }


        Prof S = PS.FindOne( A ) ;



        Iterable<Takelesson> list = TLS.FindProfCourseStudents( S ) ;

        temp.addObject("Course" , list ) ;


        temp.setViewName("StudentsList");
        return temp ;

//update_profile   prof_score
    }



    @RequestMapping( value = "/prof_score" ,method = RequestMethod.POST )
    public ModelAndView StudentGrade ( ModelAndView mav  , HttpSession httpSession ,
                                       @RequestParam("Code") Integer Code ,
                                       @RequestParam("Score") String Score )
    {

        ModelAndView temp = new ModelAndView() ;

        if( httpSession == null )
        {
            temp.setViewName("redirect:/Prof");
            return temp ;
        }

        Integer A = ( (Integer ) httpSession.getAttribute("Username") ) ;
        String B = (String )httpSession.getAttribute("Type") ;



        if ( A == null && B == null  )
        {
            temp.setViewName("redirect:/Prof");
            return temp ;
        }

        if (  !(  B.equals("Prof")  )   )
        {
            temp.setViewName("redirect:/Prof");
            return temp ;
        }


        Prof S = PS.FindOne( A ) ;

        Takelesson tl = TLS.FindOne( Code) ;
        tl.setScore( Score);
        TLS.Save( tl ) ;

        Iterable<Takelesson> list = TLS.FindProfCourseStudents( S ) ;

        temp.addObject("Course" , list ) ;


        temp.setViewName("StudentsList");
        return temp ;

//update_profile   prof_score
    }



    @RequestMapping( value = "/AdminLoginController" ,method = RequestMethod.POST )
    public ModelAndView Adminlogin(@RequestParam("username") @Valid Integer username ,
                              @RequestParam("password")  String password  ) {
        //List<Person> personList = personService.loadAll();

        //model.addAttribute("personList", personList);


        ModelAndView temp = new ModelAndView() ;

//        if ( errors.hasErrors() )
//        {
//          temp.addObject( "msg" , "نام کاربری معتبر نیست ") ;
//          temp.setViewName( "index");
//          return  temp ;
//        }



        Person S = PerS.FindOne( username ) ;

        if (  ( S != null ) && ( S.getPassword().equals( password ) ) )
        {
            temp.setViewName("AdminDashboard");
            temp.addObject( "Username" , username  ) ;
            temp.addObject( "Type" , "Admin" ) ;


            return temp ;


        }


        temp.setViewName("AdminLogin");
        temp.addObject( "msg" , "نام کاربری یا گذرواژه اشتباه است . ");
        return temp; // return index.html Template
    }



    //DefineLessonOrTerm


    @RequestMapping( value = "/adminprofile" ,method = RequestMethod.GET )
    public ModelAndView AdminProfile ( ModelAndView mav  , HttpSession httpSession  )
    {

        ModelAndView temp = new ModelAndView() ;

        if( httpSession == null )
        {
            temp.setViewName("redirect:/Admin");
            return temp ;
        }

        Integer A = ( (Integer ) httpSession.getAttribute("Username") ) ;
        String B = (String )httpSession.getAttribute("Type") ;



        if ( A == null && B == null  )
        {
            temp.setViewName("redirect:/Admin");
            return temp ;
        }

        if (  !(  B.equals("Admin")  )   )
        {
            temp.setViewName("redirect:/Admin");
            return temp ;
        }





        temp.setViewName("AdminAccount");
        return temp ;

//update_profile   prof_score
    }



    @RequestMapping( value = "/DefineLesson" ,method = RequestMethod.GET )
    public ModelAndView AdminDefineLesson ( ModelAndView mav  , HttpSession httpSession  )
    {

        ModelAndView temp = new ModelAndView() ;

        if( httpSession == null )
        {
            temp.setViewName("redirect:/Admin");
            return temp ;
        }

        Integer A = ( (Integer ) httpSession.getAttribute("Username") ) ;
        String B = (String )httpSession.getAttribute("Type") ;



        if ( A == null && B == null  )
        {
            temp.setViewName("redirect:/Admin");
            return temp ;
        }

        if (  !(  B.equals("Admin")  )   )
        {
            temp.setViewName("redirect:/Admin");
            return temp ;
        }


        Iterable<Course> list = CS.FindAll() ;

        temp.addObject( "Course" , list ) ;

        Iterable<Pre> pre = PreS.FindAll() ;

        temp.addObject( "Pre" , pre ) ;

        temp.setViewName("DefineLesson");
        return temp ;

//update_profile   prof_score   DefLess
    }




    @RequestMapping( value = "/DefLess" ,method = RequestMethod.POST )
    public ModelAndView AdminDefLess( ModelAndView mav  , HttpSession httpSession ,
                                      @RequestParam("name") String  name ,
                                      @RequestParam("score") String score ,
                                      @RequestParam("type") String type ,
                                      @RequestParam ("group") String group )
    {

        ModelAndView temp = new ModelAndView() ;

        if( httpSession == null )
        {
            temp.setViewName("redirect:/Admin");
            return temp ;
        }

        Integer A = ( (Integer ) httpSession.getAttribute("Username") ) ;
        String B = (String )httpSession.getAttribute("Type") ;



        if ( A == null && B == null  )
        {
            temp.setViewName("redirect:/Admin");
            return temp ;
        }

        if (  !(  B.equals("Admin")  )   )
        {
            temp.setViewName("redirect:/Admin");
            return temp ;
        }


        Course t = new Course() ;
        t.setCourseName( name );
        t.setCourseScore( score );
        t.setCourseType( type );
        t.setCourseGroup( group );

        CS.Save( t) ;

        Iterable<Course> list = CS.FindAll() ;

        Iterable<Pre> pre = PreS.FindAll() ;

        temp.addObject( "Pre" , pre ) ;

        temp.addObject( "Course" , list ) ;

        temp.setViewName("DefineLesson");
        return temp ;

//update_profile   prof_score   DefLess
    }



    @RequestMapping( value = "/UpdateLess" ,method = RequestMethod.POST )
    public ModelAndView AdminUpdateLess( ModelAndView mav  , HttpSession httpSession ,
                                      @RequestParam("name") String  name ,
                                      @RequestParam("score") String score ,
                                      @RequestParam("type") String type ,
                                      @RequestParam ("group") String group ,
                                         @RequestParam("Code") Integer  Code)
    {

        ModelAndView temp = new ModelAndView() ;

        if( httpSession == null )
        {
            temp.setViewName("redirect:/Admin");
            return temp ;
        }

        Integer A = ( (Integer ) httpSession.getAttribute("Username") ) ;
        String B = (String )httpSession.getAttribute("Type") ;



        if ( A == null && B == null  )
        {
            temp.setViewName("redirect:/Admin");
            return temp ;
        }

        if (  !(  B.equals("Admin")  )   )
        {
            temp.setViewName("redirect:/Admin");
            return temp ;
        }


        Course t = CS.FindOne( Code ) ;

        if ( t != null )
        {

            if ( name != null && name != "")
            {
                t.setCourseName( name );
            }

            if ( score != null && score != "")
            {
                t.setCourseScore( score );
            }

            if ( type != null && type != "")
            {
                t.setCourseType( type );
            }

            if ( group != null && group != "")
            {
                t.setCourseGroup( group );
            }



            CS.Save( t ) ;


        }


        Iterable<Course> list = CS.FindAll() ;

        temp.addObject( "Course" , list ) ;

        Iterable<Pre> pre = PreS.FindAll() ;

        temp.addObject( "Pre" , pre ) ;

        temp.setViewName("DefineLesson");
        return temp ;

//update_profile   prof_score   DefLess
    }



    @RequestMapping( value = "/AddPre" ,method = RequestMethod.POST )
    public ModelAndView AdminAddPre( ModelAndView mav  , HttpSession httpSession ,
                                         @RequestParam("Code") Integer  Code ,
                                         @RequestParam("PreCode") Integer  PreCode  )
    {

        ModelAndView temp = new ModelAndView() ;

        if( httpSession == null )
        {
            temp.setViewName("redirect:/Admin");
            return temp ;
        }

        Integer A = ( (Integer ) httpSession.getAttribute("Username") ) ;
        String B = (String )httpSession.getAttribute("Type") ;



        if ( A == null && B == null  )
        {
            temp.setViewName("redirect:/Admin");
            return temp ;
        }

        if (  !(  B.equals("Admin")  )   )
        {
            temp.setViewName("redirect:/Admin");
            return temp ;
        }





        Iterable<Course> list = CS.FindAll() ;




        Pre p = new Pre() ;

        Course Asli = CS.FindOne( Code );

        Course Pish = CS.FindOne( PreCode) ;

        if ( Asli != null && Pish != null )
        {
            p.setCourseID( Asli);
            p.setPreRequireID( Pish);
            PreS.Save( p );
        }


        Iterable<Pre> pre = PreS.FindAll() ;

        temp.addObject( "Pre" , pre ) ;

        temp.addObject( "Course" , list ) ;

        temp.setViewName("DefineLesson");
        return temp ;

//update_profile   prof_score   DefLess
    }

    @RequestMapping( value = "/DeleteLess" ,method = RequestMethod.POST )
    public ModelAndView AdminDeleteLess( ModelAndView mav  , HttpSession httpSession ,
                                         @RequestParam("Code") Integer  Code)
    {

        ModelAndView temp = new ModelAndView() ;

        if( httpSession == null )
        {
            temp.setViewName("redirect:/Admin");
            return temp ;
        }

        Integer A = ( (Integer ) httpSession.getAttribute("Username") ) ;
        String B = (String )httpSession.getAttribute("Type") ;



        if ( A == null && B == null  )
        {
            temp.setViewName("redirect:/Admin");
            return temp ;
        }

        if (  !(  B.equals("Admin")  )   )
        {
            temp.setViewName("redirect:/Admin");
            return temp ;
        }


        Course t = CS.FindOne( Code ) ;

        if ( t != null )
        {

            CS.Delete( t );


        }


        Iterable<Course> list = CS.FindAll() ;


        Iterable<Pre> pre = PreS.FindAll() ;

        temp.addObject( "Pre" , pre ) ;

        temp.addObject( "Course" , list ) ;

        temp.setViewName("DefineLesson");
        return temp ;

//update_profile   prof_score   DefLess
    }


    @RequestMapping( value = "/DeletePre" ,method = RequestMethod.POST )
    public ModelAndView AdminDeletePre( ModelAndView mav  , HttpSession httpSession ,
                                         @RequestParam("Code") Integer  Code)
    {

        ModelAndView temp = new ModelAndView() ;

        if( httpSession == null )
        {
            temp.setViewName("redirect:/Admin");
            return temp ;
        }

        Integer A = ( (Integer ) httpSession.getAttribute("Username") ) ;
        String B = (String )httpSession.getAttribute("Type") ;



        if ( A == null && B == null  )
        {
            temp.setViewName("redirect:/Admin");
            return temp ;
        }

        if (  !(  B.equals("Admin")  )   )
        {
            temp.setViewName("redirect:/Admin");
            return temp ;
        }





        Iterable<Course> list = CS.FindAll() ;


        Pre p = PreS.FindOne( Code ) ;

        if ( p != null )
        {
            PreS.Delete(p );
        }


        Iterable<Pre> pre = PreS.FindAll() ;

        temp.addObject( "Pre" , pre ) ;

        temp.addObject( "Course" , list ) ;

        temp.setViewName("DefineLesson");
        return temp ;

//update_profile   prof_score   DefLess
    }



    @RequestMapping( value = "/Term" ,method = RequestMethod.GET )
    public ModelAndView AdminTerm( ModelAndView mav  , HttpSession httpSession )
    {

        ModelAndView temp = new ModelAndView() ;

        if( httpSession == null )
        {
            temp.setViewName("redirect:/Admin");
            return temp ;
        }

        Integer A = ( (Integer ) httpSession.getAttribute("Username") ) ;
        String B = (String )httpSession.getAttribute("Type") ;



        if ( A == null && B == null  )
        {
            temp.setViewName("redirect:/Admin");
            return temp ;
        }

        if (  !(  B.equals("Admin")  )   )
        {
            temp.setViewName("redirect:/Admin");
            return temp ;
        }





        Iterable<Course> list = CS.FindAll() ;

        temp.addObject( "Course" , list ) ;

        Iterable<Prof> list2 = PS.FindAll() ;

        temp.addObject( "Prof" , list2 ) ;

        Iterable<Profcourse> list3 = PCS.FindAll() ;

        temp.addObject("profcourse" , list3 ) ;

        temp.setViewName("Term");
        return temp ;

//update_profile   prof_score   DefLess  CreateTerm
    }



    @RequestMapping( value = "/CreateTerm" ,method = RequestMethod.POST )
    public ModelAndView AdminCreateTerm( ModelAndView mav  , HttpSession httpSession ,
                                         @RequestParam("year") String year  ,
                                         @RequestParam("term") String term ,
                                         @RequestParam("course") Integer course ,
                                         @RequestParam("prof") Integer prof )
    {

        ModelAndView temp = new ModelAndView() ;

        if( httpSession == null )
        {
            temp.setViewName("redirect:/Admin");
            return temp ;
        }

        Integer A = ( (Integer ) httpSession.getAttribute("Username") ) ;
        String B = (String )httpSession.getAttribute("Type") ;



        if ( A == null && B == null  )
        {
            temp.setViewName("redirect:/Admin");
            return temp ;
        }

        if (  !(  B.equals("Admin")  )   )
        {
            temp.setViewName("redirect:/Admin");
            return temp ;
        }



        Profcourse pc = new Profcourse() ;

        Prof p = PS.FindOne( prof) ;

        Course c = CS.FindOne( course ) ;

        if ( p != null && c != null )
        {
            pc.setTerm(term);
            pc.setCourseID( c);
            pc.setProfID(p );
            pc.setYear( year);
            PCS.Save( pc );
        }


        Iterable<Course> list = CS.FindAll() ;

        temp.addObject( "Course" , list ) ;

        Iterable<Prof> list2 = PS.FindAll() ;

        temp.addObject( "Prof" , list2 ) ;


        Iterable<Profcourse> list3 = PCS.FindAll() ;

        temp.addObject("profcourse" , list3 ) ;

        temp.setViewName("Term");
        return temp ;

//update_profile   prof_score   DefLess  CreateTerm
    }


}
