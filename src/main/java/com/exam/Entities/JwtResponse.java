package com.exam.Entities;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

public class JwtResponse {
    private String token;
}
