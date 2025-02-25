package com.nuyoahch.weblog.common.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @program: weblog
 * @author: NuyoahCh
 * @create: 2025-02-25
 * @description:
 */
@Getter
@Setter
public class BizException extends RuntimeException {
    // 异常码
    private String errorCode;
    // 错误信息
    private String errorMessage;

    public BizException(BaseExceptionInterface baseExceptionInterface) {
        this.errorCode = baseExceptionInterface.getErrorCode();
        this.errorMessage = baseExceptionInterface.getErrorMessage();
    }
}