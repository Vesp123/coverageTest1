package guru.springframework.sfgpetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by jt on 7/29/18.
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {

    @Column(name = "date")
    public LocalDate date;

    @Column(name = "description")
    public String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    public Pet pet;

    public LocalDate getDate() {
        return date;
    }

}
