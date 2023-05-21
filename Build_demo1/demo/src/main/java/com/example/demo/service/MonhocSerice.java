package com.example.demo.service;
import com.example.demo.entity.Monhoc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MonhocSerice {
    @Bean
    public List<Monhoc> getBooks() {
        List<Monhoc> monhocs = new ArrayList<>();

        Monhoc book1 = new Monhoc();
        book1.setId("1");
        book1.setTitle("Lập trình Web Spring MVC");
        book1.setImage("images/th.jpg");
        monhocs.add(book1);

        Monhoc book2 = new Monhoc();
        book2.setId("2");
        book2.setTitle("Lập trình Ứng dụng Java");
        book1.setImage("images/OIP.jpg");
        monhocs.add(book2);

        Monhoc book3 =new Monhoc();
        book3.setId("3");
        book3.setTitle("Lập trinhg ứng dụng Java");
        book1.setImage("images/sach-lap-trinh-cho-tre-em.jpg");
        monhocs.add(book3);

        Monhoc book4 =new Monhoc();
        book4.setId("3");
        book4.setTitle("Lập trinhg ứng dụng Java");
        book1.setImage("images/nhung-cuon-sach-hay-ve-lap-trinh-tieng-viet.jpg");
        monhocs.add(book4);

        return monhocs;
    }
}

