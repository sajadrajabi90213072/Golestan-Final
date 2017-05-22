package de.michlb.sample.RestController;

import de.michlb.sample.DTO.StudentDTO;
import de.michlb.sample.domain.Student;
import de.michlb.sample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by Sam on 5/10/2017.
 */

@RestController
@RequestMapping("/Rest")
public class StudentRestController {

    @Autowired
    private StudentService SS ;


    @RequestMapping( value = "/GetStudent" ,method = RequestMethod.GET)
    ResponseEntity GetStudent (@RequestParam("ID") Integer ID )
    {
        Student S = SS.FindOne( ID ) ;
        StudentDTO temp = new StudentDTO() ;


        if ( S != null )
        {
            temp.Transform( S );
            return ResponseEntity.ok().body( temp ) ;
        }

        return ResponseEntity.ok().body( null ) ;

    }


    @RequestMapping( value = "/GetAllStudent" ,method = RequestMethod.GET)
    ResponseEntity GetStudent (  )
    {
        //Student S = SS.FindOne( ID ) ;



        Iterable<Student> list = SS.FindAll() ;
        ArrayList<StudentDTO> output = new ArrayList<>() ;

        for ( Student t : list )
        {
            StudentDTO temp = new StudentDTO() ;
            temp.Transform(t);
            output.add( temp) ;
        }



        return ResponseEntity.ok().body( output ) ;

    }



    @RequestMapping( value = "/CreateStudent" ,method = RequestMethod.POST)
    ResponseEntity CreateStudnet ( @RequestParam("name") String name ,
                                   @RequestParam("password") String pass ,
                                   @RequestParam("phone") String phone ,
                                   @RequestParam("ssn") String ssn ,
                                   @RequestParam("fathername") String fathername ,
                                   @RequestParam("address") String address )
    {


        Student s = new Student() ;
        s.setStudentName( name );
        s.setStudentPassword( pass );
        s.setStudentFatherName( fathername );
        s.setStudentAddress( address );
        s.setStudentPhoneNumber( phone );
        s.setStudnetNationalCode( ssn );

        s = SS.Save( s );

        StudentDTO temp = new StudentDTO() ;
        temp.Transform( s );








        return ResponseEntity.ok().body( temp ) ;


    }



}
