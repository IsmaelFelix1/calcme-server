package com.test.calcmeServer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    @NotEmpty
    @Size(min = 4, message = "o nome de usuário deve ter pelo menos 4 caracteres")
    private String name;
    @NotEmpty(message = "campo esta vazio")
    @Email
    private String email;
    @NotEmpty
    @Size(max = 11, message = "o usuário deve inserir até 11 caracteres")
    private Integer phone;

}
