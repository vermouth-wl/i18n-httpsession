package com.mvc.controller;

import com.mvc.entity.User;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

/**
 * @Classname UserController
 * @Description TODO
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-05-12 22:05
 * @Version 1.0
 **/
@Controller
public class UserController {

    @RequestMapping(value = "/{formName}")
    public String registerForm(@PathVariable String formName, String request_locale, Model model, HttpServletRequest request){
        System.out.println("request_locate值为: " + request_locale);

        if (request_locale != null) {

            // 设置中文环境
            if (request_locale.equals("zh_CN")) {
                Locale locale = new Locale("zh", "CN");
                request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, locale);

            // 设置英文环境
            } else if (request_locale.equals("en_US")) {
                Locale locale = new Locale("en", "US");
                request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, locale);

            // 设置日语环境
            } else if (request_locale.equals("ja_JP")) {
                Locale locale = new Locale("ja", "JP");
                request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, locale);
            // 设置之前的语言环境
            } else {
                request.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, LocaleContextHolder.getLocale());
            }
        }
        User user = new User();
        model.addAttribute("user", user);
        return formName;
    }

    @RequestMapping(value = "/register")
    public String register(@ModelAttribute @Validated User user, Model model){
        model.addAttribute("user", user);
        return "success";
    }

}
