package com.ktds.myspringboot.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.time.LocalDateTime;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserReqDto {
    @NotEmpty(message = "Name은 필수입력 항목입니다.")
    private String name;
    @NotBlank(message = "Email은 필수입력 항목입니다.")
    private String email;
}
