package com.example.bemedicalappointment.dto.reponse;

import com.example.bemedicalappointment.model.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
@Data
public class Profile {
    private String name;
    private Date birthday;
    private int gender;
    private String address;
    private String phone;
    private LocalDateTime create;
    private String username;
    private String email;
    private String avatar;
}
