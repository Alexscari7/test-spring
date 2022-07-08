package com.github.alexscari.testspring.controller;

import com.github.alexscari.testspring.common.exception.BusinessErrorCode;
import com.github.alexscari.testspring.common.exception.BusinessException;
import com.github.alexscari.testspring.common.entity.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wusd
 */
@RestController
@RequestMapping("/validate")
public class ValidateController {

    @GetMapping("test")
    public Response<Void> test(@RequestParam Integer id) {
        if (id == 1) {
            throw new RuntimeException("111");
        } else if (id == 2) {
            throw new BusinessException(BusinessErrorCode.BUSINESS_EXPECTION);
        } else if (id == 3) {
            throw new BusinessException(BusinessErrorCode.PARAM_MUST_NOT_NULL, "ID");
        }
        return Response.succeed();
    }

    // TODO: 2022/7/8 完成@Validate @Valid各种场景测试

}
