package main.java.dto;

import java.time.Year;
import java.sql.Date;

public class LivroDTO {

    private Long id_Livro;
    private String titulo;
    private String autor;
    private String editora;
    private Year ano_Publicacao;
    private String genero;
    private String isbn;
    private Integer num_Paginas;
    private String sinopse;
    private String idioma;
    private Date data_Cadastro;
    private Double preco;

    public Long getId_Livro() {
        return id_Livro;
    }

    public void setId_Livro(Long idLivro) {
        this.id_Livro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Year getAno_Publicacao() {
        return ano_Publicacao;
    }

    public void setAno_Publicacao(Year ano_Publicacao) {
        this.ano_Publicacao = ano_Publicacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getNum_Paginas() {
        return num_Paginas;
    }

    public void setNum_Paginas(Integer num_Paginas) {
        this.num_Paginas = num_Paginas;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Date getData_Cadastro() {
        return data_Cadastro;
    }

    public void setData_Cadastro(Date data_Cadastro) {
        this.data_Cadastro = data_Cadastro;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "LivroDTO [idLivro=" + id_Livro + ", titulo=" + titulo + ", autor=" + autor + ", editora=" + editora
                + ", ano_Publicacao=" + ano_Publicacao + ", genero=" + genero + ", isbn=" + isbn + ", num_Paginas="
                + num_Paginas + ", sinopse=" + sinopse + ", idioma=" + idioma + ", data_Cadastro=" + data_Cadastro
                + ", preco=" + preco + "]";
    }

}
