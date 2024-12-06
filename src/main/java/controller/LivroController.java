package main.java.controller;

import model.LivroModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.LivroService;

import java.util.List;

@Controller
@RequestMapping("/livros")
public class LivroController {

    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping
    public String listarLivros(Model model) {
        List<LivroModel> livros = livroService.listAll();
        model.addAttribute("livros", livros);
        return "list-livros";
    }

    @GetMapping("/{id}")
    public String detalharLivro(@PathVariable Long id, Model model) {
        LivroModel livro = livroService.getById(id);
        model.addAttribute("livro", livro);
        return "detail-livro";
    }

    @GetMapping("/novo")
    public String novoLivroForm(Model model) {
        model.addAttribute("livro", new LivroModel());
        return "form-livro";
    }

    @PostMapping
    public String salvarLivro(@ModelAttribute LivroModel livro) {
        livroService.addLivro(livro);
        return "redirect:/livros";
    }

    @GetMapping("/delete/{id}")
    public String deletarLivro(@PathVariable Long id) {
        livroService.deleteLivro(id);
        return "redirect:/livros";
    }

    @GetMapping("/search")
    public String buscarLivrosPorTitulo(@RequestParam("titulo") String titulo, Model model) {
        List<LivroModel> livros = livroService.findByTitulo(titulo);
        model.addAttribute("livros", livros);
        return "list-livros";
    }

    @GetMapping("/searchByISBN")
    public String buscarLivroPorIsbn(@RequestParam("isbn") String isbn, Model model) {
        LivroModel livro = livroService.findByIsbn(isbn);
        model.addAttribute("livro", livro);
        return "detail-livro";
    }

}
