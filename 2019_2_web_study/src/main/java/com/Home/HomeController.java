package com.Home;

import com.Cat.Cats;
import com.Cat.MyCats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import java.util.ArrayList;

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public ModelAndView Home(){


        //ModelAndView 객체 선언
        ModelAndView mv=new ModelAndView();

        //IOC 컨테이너 호출
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(AddObjects.class);

        //호출한 컨테이너로 객체 주입
        Cats catsInfo = ctx.getBean("catsInfo",Cats.class);
        catsInfo.getMyCatsInfo();

        MyCats cat2 = ctx.getBean("cat2",MyCats.class);
        catsInfo.setMyCatsInfo(cat2);
        catsInfo.getMyCatsInfo();
        //여기까지 주입

        //주입된 객체들을 view에서 보여주기 위해, 가져온 객체들을 Model에 추가
        mv.addObject("color",cat2.getColor());
        mv.addObject("name",cat2.getName());
        mv.setViewName("home");

        //컨테이너 종료
        ctx.close();

        //데이터와, view 이름을 저장해둔 객체를 반환
        return mv;
    }
}