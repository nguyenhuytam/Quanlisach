package com.example.demo.controller;

import com.example.demo.entity.Monhoc;
import com.example.demo.service.MonhocSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/books")
public class BookController {
   @Autowired
    public List<Monhoc> monhocList;
   public MonhocSerice monhocSerice;
@GetMapping
    public String listBooks(Model model){
        model.addAttribute("book",monhocList );
        model.addAttribute("title", "Book List");
        return "monhoc/monhoclist";
    }

    @GetMapping("/addmonhoc")
    public String addBookFrom(Model model){
        model.addAttribute("book", new Monhoc());
        return "monhoc/addmonhoc";
    }

    @PostMapping("/addmonhoc")
    public String addBook(@ModelAttribute("book") Monhoc monhoc){
        monhocList.add(monhoc);
        return "redirect:/books";
    }

    @GetMapping("/edit/{id}")
    public String editBookFrom(@PathVariable("id") Long id, Model model){
        Optional<Monhoc> editBook = monhocList.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst();
        if (editBook.isPresent()){
            model.addAttribute("book", editBook.get());
            return "monhoc/edit";
        }else{
            return "not-found";
        }
    }
    @GetMapping("/buynow")
    public String showUserDetail(@RequestParam("id") int id, Model model) {
        Monhoc monhoc = monhocList.get(id);
        if (monhoc == null) {
            model.addAttribute("message", "Không tìm thấy người dùng có IdNumber \"" + id + "\"");
        } else {
            model.addAttribute("book", monhoc);
        }
        return "monhoc/buynow";
    }


    @PostMapping("/edit")
    public String editBook(@ModelAttribute("book") Monhoc updateBook){
        monhocList.stream()
                .filter(book -> book.getId() == updateBook.getId())
                .findFirst()
                .ifPresent(book -> monhocList.set(monhocList.indexOf(book), updateBook));
        return "redirect:/books";

    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") Long id){
        monhocList.removeIf(book -> book.getId().equals(id));
        return "redirect:/books";
    }



}
