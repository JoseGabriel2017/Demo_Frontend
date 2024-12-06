package main.java.service;

import model.LivroModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class LivroService {

    private final RestTemplate restTemplate;
    private final String API_URL = "http://localhost:8080/livro";

    public LivroService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<LivroModel> listAll() {
        return Arrays.asList(restTemplate.getForObject(API_URL + "/listall", LivroModel[].class));
    }

    public LivroModel getById(Long id) {
        return restTemplate.getForObject(API_URL + "/findById/" + id, LivroModel.class);
    }

    public void addLivro(LivroModel livro) {
        restTemplate.postForObject(API_URL, livro, LivroModel.class);
    }

    public void deleteLivro(Long id) {
        restTemplate.delete(API_URL + "/" + id);
    }

    public List<LivroModel> findByTitulo(String titulo) {
        String url = API_URL + "/findByTitle/" + titulo;
        return Arrays.asList(restTemplate.getForObject(url, LivroModel[].class));
    }

    public LivroModel findByIsbn(String isbn) {
        String url = API_URL + "/findByISBN/" + isbn;
        return restTemplate.getForObject(url, LivroModel.class);
    }

}
