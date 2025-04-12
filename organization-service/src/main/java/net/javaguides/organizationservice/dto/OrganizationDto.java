package net.javaguides.organizationservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.LocalDateTime;

@Schema(
        name = "OrganizationDto module",
        description = "OrganizationDto modal class"
)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationDto {
    private Long id;
    @Schema(description = "Organization Name ")
    private String organizationName;
    @Schema(description = "Organization Description ")
    private String organizationDescription;
    @Schema(description = "Organization Code ")
    private String organizationCode;
    @Schema(description = "Organization created Date ")
    private LocalDateTime createdDate;
}
