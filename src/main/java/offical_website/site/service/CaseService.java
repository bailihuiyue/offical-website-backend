package offical_website.site.service;

import offical_website.site.model.Cases;

import java.util.List;

public interface CaseService {
    int createCase(String img, String title, String content);

    int deleteCase(long id);

    int updateCase(long id, String img, String title, String content);

    List<Cases> getCaseAll();

    Cases getCaseById(long id);
}