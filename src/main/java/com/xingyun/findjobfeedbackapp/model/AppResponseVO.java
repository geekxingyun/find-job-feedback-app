package com.xingyun.findjobfeedbackapp.model.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author qing-feng.zhao
 */
@Component
@Data
public class AppResponseVO {
    private Integer responseCode;
    private String responseMessage;
    private String responseBusinessData;
}
