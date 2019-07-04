package cn.exceptioncoder.spring.boot.component;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Book {
    @Value("${book.name}")
    private String name;

    @Value("${book.author}")
    private String author;
}
