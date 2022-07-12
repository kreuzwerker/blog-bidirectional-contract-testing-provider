package de.kreuzwerker.blogs.bidirectionalprovider.objects;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String email;
    @Schema(type = "string", format = "uuid")
    private String employeeId;
}
