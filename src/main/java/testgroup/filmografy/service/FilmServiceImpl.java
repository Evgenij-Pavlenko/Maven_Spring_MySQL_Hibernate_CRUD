package testgroup.filmografy.service;

import org.springframework.stereotype.Service;
import testgroup.filmografy.DAO.FilmDAO;
import testgroup.filmografy.DAO.FilmDAOImpl;
import testgroup.filmografy.model.Film;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class FilmServiceImpl implements FilmService {
    private FilmDAO filmDAO = new FilmDAOImpl();

    @Override
    @Transactional
    public List<Film> allFilms() {
        return filmDAO.allFilms();
    }

    @Override
    @Transactional
    public void add(Film film) {
        filmDAO.add(film);
    }

    @Override
    @Transactional
    public void delete(Film film) {
        filmDAO.delete(film);
    }

    @Override
    @Transactional
    public void edit(Film film) {
        filmDAO.edit(film);
    }

    @Override
    @Transactional
    public Film getById(int id) {
        return filmDAO.getById(id);
    }
}
