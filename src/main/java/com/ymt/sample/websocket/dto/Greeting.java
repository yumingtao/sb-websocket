package com.ymt.sample.websocket.dto;

import lombok.Builder;
import lombok.Data;

/**
 * Description
 *
 * @author yumingtao
 * @date 2021/8/20 21:58
 */
@Data
@Builder
public class Greeting {
    private String content;
}
