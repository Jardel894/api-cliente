package br.com.arieltintel.cliente.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TelefoneRequestDTO {

    @Length(min = 2, max = 3)
    private String ddd;

    @Length(min = 5, max = 20)
    private String numero;

}
