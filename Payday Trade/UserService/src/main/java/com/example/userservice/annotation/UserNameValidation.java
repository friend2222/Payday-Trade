package com.example.userservice.annotation;


import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotBlank;
import java.lang.annotation.*;

@Documented
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@NotBlank(message="Name can not be null")
public @interface UserNameValidation {

    String message() default "This user already exist";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}