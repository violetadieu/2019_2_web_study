package com.Home;

import com.Cat.Cats;
import com.Cat.MyCats;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class AddObjects {

    @Bean // 객체를 생성하는 어노테이션
    public MyCats cat1(){

        ArrayList<String> hobbys = new ArrayList<String>();
        hobbys.add("잠자기");
        hobbys.add("꾹꾹이");

        MyCats myCats = new MyCats("나비",2,hobbys); //생성자
        myCats.setWeight(2.0);                     //setter()
        myCats.setColor("black");                  //setter()

        return myCats;                            //MyCats 객체 리턴
    }

    @Bean
    public MyCats cat2(){

        ArrayList<String> hobbys = new ArrayList<String>();
        hobbys.add("우다다");
        hobbys.add("박치기");

        MyCats myCats = new MyCats("호랑이",1,hobbys);
        myCats.setWeight(3.2);
        myCats.setColor("white");

        return myCats;
    }

    @Bean
    public Cats catsInfo(){

        Cats cats = new Cats(this.cat1());

        return cats;
    }


}
