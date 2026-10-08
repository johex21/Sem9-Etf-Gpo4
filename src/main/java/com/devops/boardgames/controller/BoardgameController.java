package com.devops.boardgames.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.devops.boardgames.model.Boardgame;
import com.devops.boardgames.repository.BoardgameRepository;

@Controller
public class BoardgameController {

    @Autowired
    private BoardgameRepository repository;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("games", repository.findAll());
        model.addAttribute("newGame", new Boardgame());
        return "index";
    }

    @PostMapping("/games/add")
    public String addGame(@ModelAttribute Boardgame game) {
        if (game.getImageUrl() == null || game.getImageUrl().trim().isEmpty()) {
            game.setImageUrl("https://images.unsplash.com/photo-1610890716171-6b1bb98ffd09?w=500");
        }
        repository.save(game);
        return "redirect:/";
    }

    @GetMapping("/games/delete/{id}")
    public String deleteGame(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/";
    }
}
