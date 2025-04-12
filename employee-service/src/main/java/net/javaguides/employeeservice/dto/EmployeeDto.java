package net.javaguides.employeeservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(
        name = "EmployeeDto model class",
        description = "Employee EmployeeDto "
)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private Long id;
    @Schema(description = "First Name")
    private String firstName;
    @Schema(description = "Last Name")
    private String lastName;
    @Schema(description = "email")
    private String email;
    @Schema(description = "department Code")
    private String departmentCode;
    @Schema(description = "organization Code")
    private String organizationCode;
}
