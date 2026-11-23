package com.ua.moviestore.config;

import com.ua.moviestore.domain.Movie;
import com.ua.moviestore.repository.MovieRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class MovieSeeder implements ApplicationRunner {

    private final MovieRepository repository;

    public MovieSeeder(MovieRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(ApplicationArguments args) {
        repository.save(new Movie(null, "Тіні забутих предків", "Сергій Параджанов",
                new BigDecimal("150.00"), 1965, "/posters/tini-zabutykh-predkiv.jpg",
                "Історія кохання Івана та Марічки на тлі гуцульських традицій.", "Драма"));
        repository.save(new Movie(null, "Земля", "Олександр Довженко",
                new BigDecimal("120.00"), 1930, "/posters/zemlia.jpg",
                "Німий фільм про українське село часів колективізації.", "Драма"));
        repository.save(new Movie(null, "Інтерстеллар", "Крістофер Нолан",
                new BigDecimal("199.00"), 2014, "/posters/interstellar.jpg",
                "Група дослідників вирушає крізь червоточину в пошуках нового дому для людства.", "Фантастика"));
        repository.save(new Movie(null, "Матриця", "Лана і Лілі Вачовські",
                new BigDecimal("179.00"), 1999, "/posters/matrix.jpg",
                "Хакер Нео дізнається, що світ навколо — комп'ютерна симуляція.", "Фантастика"));
        repository.save(new Movie(null, "Хоробре серце", "Мел Гібсон",
                new BigDecimal("169.00"), 1995, "/posters/braveheart.jpg",
                "Вільям Воллес очолює повстання шотландців проти англійського панування.", "Історичний"));
    }
}
