package com.leoncarraro.agendamento_vacina.model.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class VaccineApplicationVO {

    private Long userId;
    private Integer groupId;
    private Integer healthPostId;
    private Integer scheduleId;

}
