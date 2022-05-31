package site.metacoding.blogv4junit.domain.book;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;


@Getter
@Entity
public class Book {



    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
     private Long id; // mapping 타입을 써라. 0이 들어오면 막는다.
    private String title;
    private String author;


    @Builder
    public Book(Long id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    //필요한 생성자만 만든다. 
    }



}

