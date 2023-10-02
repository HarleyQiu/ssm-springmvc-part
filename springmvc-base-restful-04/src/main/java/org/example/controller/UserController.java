package org.example.controller;

import org.example.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public List<User> page(
            @RequestParam(required = false, defaultValue = "1") Integer page,
            @RequestParam(required = false, defaultValue = "10") Integer size
    ) {
        System.out.println("page = " + page + ", size = " + size);
        return null;
    }

    @PostMapping
    public User save(@RequestBody User user) {
        System.out.println("user = " + user);
        return null;
    }

    @GetMapping("{id}")
    public User detail(@PathVariable Integer id) {
        System.out.println("id = " + id);
        return null;
    }

    @PutMapping
    public User update(@RequestBody User user) {
        System.out.println("user = " + user);
        return user;
    }

    @DeleteMapping("{id}")
    public User delete(@PathVariable Integer id) {
        System.out.println("id = " + id);
        return null;
    }

    @GetMapping("search")
    public List<User> search(String keyword,
                             @RequestParam(required = false, defaultValue = "1") Integer page,
                             @RequestParam(required = false, defaultValue = "10") Integer size) {
        System.out.println("keyword = " + keyword + ", page = " + page + ", size = " + size);
        return null;
    }
}
