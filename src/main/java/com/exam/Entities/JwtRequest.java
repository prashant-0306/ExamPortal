package com.exam.Entities;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Builder
public class JwtRequest {
    private String username;
    private String password;


}
