package pe.ineapp.ineapppersonaservice.Person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @GetMapping
    @RequestMapping("/getAll")
    public List<Person> getPersona(){
       Person person1 = new Person(1,"Pablo","La Plata","76190816","Creatividad");
       Person person2 = new Person(2,"Omar","Rojas","71892547","Aplicaciones");

       return List.of(person1,person2);
    }


}
