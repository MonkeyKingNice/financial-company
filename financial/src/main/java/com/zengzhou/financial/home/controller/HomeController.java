package com.zengzhou.financial.home.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:[描述该文件作用]
 *
 * @author [Administrator]
 * @version v1.0
 * @since 2020-05-08
 * 包:[com.zengzhou.financial.home.controller]
 * 文件名:[HomeController]
 * 创建时间:[2020-05-08 14:42]
 * 修改人:[Administrator]
 * 修改时间:[2020-05-08 14:42]
 * 修改备注:[说明本次修改内容]
 * A版权所有 (A) ***技术有限公司 2020-2020
 */
@RestController
public class HomeController {
    @RequestMapping("/hello")
    public String show() {
        return "Hello world";
    }
}
