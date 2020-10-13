package by.grsu.vitovt.carsharing.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Description {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String transmission;
    @Column
    private String description;
    @Column
    private String colour;
    @OneToOne
    @JsonIgnore
    private Car car;
    @OneToMany
    private Collection<Image> image;
}
