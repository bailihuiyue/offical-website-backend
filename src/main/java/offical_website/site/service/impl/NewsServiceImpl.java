package offical_website.site.service.impl;

import offical_website.site.dao.NewsMapper;
import offical_website.site.model.News;
import offical_website.site.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    NewsMapper newsMapper;

    @Override
    public int createNews(int type, String img, String title, String content) {
        int news = newsMapper.createNews(type, img, title, content);
        return news;
    }

    @Override
    public int deleteNews(long id) {
        int news = newsMapper.deleteNews(id);
        return news;
    }

    @Override
    public int updateNews(int type, long id, String img, String title, String content) {
        int news = newsMapper.updateNews(type, id, img, title, content);
        return news;
    }

    @Override
    public List<News> getNewsAll() {
        List<News> news = newsMapper.getNewsAll();
        return news;
    }

    @Override
    public News getNewsById(long id) {
        News news = newsMapper.getNewsById(id);
        return news;
    }
}