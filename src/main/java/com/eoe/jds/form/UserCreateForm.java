package com.eoe.jds.form;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
public class UserCreateForm {
    @Size(min = 3, max = 10, message = "πμ¬μ©μ IDλ 3~10μ μ¬μ΄λ‘ μλ ₯ν΄μ£ΌμΈμ.")
    @NotEmpty(message = "πμ¬μ©μ IDλ νμν­λͺ©μλλ€.")
    @NotBlank(message = "πμ¬μ©μ IDλ κ³΅λ°±λ§ λ€μ΄κ° μ μμ΅λλ€.")
    private String username;

    @Size(min =8, max =15, message = "πλΉλ°λ²νΈλ 8~15μ μ¬μ΄λ‘ μλ ₯ν΄μ£ΌμΈμ.")
    @NotEmpty(message = "πλΉλ°λ²νΈλ νμν­λͺ©μλλ€.")
    private String password1;

    @NotEmpty(message = "πλΉλ°λ²νΈ νμΈμ νμν­λͺ©μλλ€.")
    private String password2;

    @NotEmpty(message = "πμ΄λ©μΌμ νμν­λͺ©μλλ€.")
    @Email
    private String email;
}