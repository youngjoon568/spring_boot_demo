package org.zerock.b01.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReplyDTO {

    private Long rno;
    @NotNull
    private Long bno;
    @NotEmpty
    private String replyText;
    @NotEmpty
    private String replyer;

    private LocalDateTime regDate, modDate;
}
