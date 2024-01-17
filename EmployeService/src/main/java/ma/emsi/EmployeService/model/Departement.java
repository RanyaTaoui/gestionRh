package ma.emsi.EmployeService.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Data
public class Departement {
    private Long id;
    private String nom;
    private String description;

}
