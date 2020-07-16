package offical_website.site.service;

import offical_website.site.model.News;

import java.util.List;

public interface NewsService {
    int createNews(int type,String img, String title, String content);

    int deleteNews(long id);

    int updateNews(int type,long id, String img, String title, String content);

    List<News> getNewsAll();

    News getNewsById(long id);
}