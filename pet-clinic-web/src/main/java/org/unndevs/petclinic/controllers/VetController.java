package org.unndevs.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.unndevs.petclinic.services.VetService;

@Controller
public class VetController {
    private final VetService vetService;

    public VetController(final VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets(final Model model) {
        model.addAttribute("vets",vetService.findAll());
        return "vets/index";
    }
}
