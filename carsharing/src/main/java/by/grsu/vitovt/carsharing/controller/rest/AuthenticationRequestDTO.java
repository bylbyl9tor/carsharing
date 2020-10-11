package by.grsu.vitovt.carsharing.controller.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationRequestDTO {
    private String email;
    private String password;
}
