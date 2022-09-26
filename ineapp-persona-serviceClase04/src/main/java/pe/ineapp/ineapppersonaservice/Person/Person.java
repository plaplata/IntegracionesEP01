package pe.ineapp.ineapppersonaservice.Person;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;


@Data
@Builder
public class Person {

    @Id
    Integer id;
    String nombre;
    String apellido;
    String dni;
    String curso;

}
