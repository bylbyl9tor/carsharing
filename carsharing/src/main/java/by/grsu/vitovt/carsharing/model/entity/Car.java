package by.grsu.vitovt.carsharing.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String markName;
    @Column
    private String modelName;
    @Column
    private String issueYear;
    @Column
    private Double price;
    @Column
    private String type;
    @Column
    private String frontPicture;
    @OneToOne(fetch = FetchType.LAZY)
    private Description description;
}
